package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * 聊天室服务端
 * 
 * @author soft01
 *
 */
public class Server {

	/*
	 * 运行在服务端的java.net.ServerSocket 主要有两个作用： 1：向系统申请服务端口，客户端就是通过该端口与服务端建立连接的。
	 * 2：监听服务端口，一旦客户端发起连接则会自动创建一个Socket与该客户端进行交互。
	 */
	private ServerSocket server;
	/*
	 * 该数组用于保存所有的ClientHandler对应的输出流，便于所有的ClientHandler获取以广播消息给所有客户端
	 * 由于内部类可以访问外部类属性，对此经常可以在外部类上定义属性作为所有内部类的公共区域来共享它们的信息使用。
	 */
	// private PrintWriter[] allOut = {};
	private ArrayList<PrintWriter> arr = new ArrayList<PrintWriter>();

	public Server() {
		try {
			/*
			 * 实例化ServerSocket的同时向系统申请端口 若端口已经被其他应用程序所占用时会抛出被使用的异常。
			 */
			System.out.println("正在启动服务器...");
			server = new ServerSocket(9918);
			System.out.println("服务器启动完毕！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			/*
			 * Socket accept() 该方法是一个阻塞方法，当调用后就开始等待客户端的连接，知道一个客户端连接，那么该方法会返回一个
			 * Socket，服务端可以通过这个Socket与刚建立连接的客户端进行交互。
			 */

			while (true) {
				System.out.println("主线程：等待客户端连接...");
				Socket socket = server.accept();
				System.out.println("主线程：一个客户端连接了！");
				ClientHandler handler = new ClientHandler(socket);
				Thread t = new Thread(handler);
				t.start();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Server server = new Server();
		server.start();
	}

	private class ClientHandler implements Runnable {
		private String host;
		private Socket socket;

		public ClientHandler(Socket socket) {
			this.socket = socket;
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}

		public void run() {
			PrintWriter pw = null;
			try {
				/*
				 * 通过Socket获取输出流，用于给客户端发送消息
				 */
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw = new PrintWriter(bw, true);
				/*
				 * 将该输出流存入allOut数组中，以便其他ClientHandler也可以将消息转发给当前客户端
				 */
				synchronized (arr) {
					arr.add(pw);
					// allOut=Arrays.copyOf(allOut, allOut.length+1) ;
					// allOut[allOut.length-1]=pw;
				}
				/*
				 * 
				 * 通过Socket获取输入流： InputStream getInputStream（） 通过这个流就可以读取到客户端发送过来的消息
				 */
				InputStream in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String line;
				while ((line=br.readLine())!=null) {
					System.out.println(host + "说：" + line);

					// pw.println(host + "说：" + line);
					// 回复所有客户端
					synchronized (arr) {

						for (PrintWriter p:arr) {
							p.println(host + "说：" + line);
						}
						// for(int i=0;i<allOut.length;i++) {
						//
						// allOut[i].println(host + "说：" + line);
						// }
					}
				}
			} catch (Exception e) {

				e.printStackTrace();
			} finally {
				synchronized (arr) {
					arr.remove(pw);
					// for (int i = 0; i < allOut.length; i++) {
					// if (allOut[i] == pw) {
					// allOut[i] = allOut[allOut.length - 1];
					// break;
					// }
					// }
					// allOut = Arrays.copyOf(allOut, allOut.length - 1);
				}
				// 处理当前客户端断开连接后的操作
				try {

					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			/*
			 * 服务端通过br.readLine方法读取客户端发送过来的一行字符串时， 当客户端断开连接时，客户端在不同操作系统上，服务端这边反应是不同的：
			 * 当windows的客户端断开连接时，服务端这边通常readLine方法会直接抛出异常。
			 * 当linux的客户端断开连接时，服务端这边的常见反应时readLine方法返回值为null
			 */

		}
	}
}
