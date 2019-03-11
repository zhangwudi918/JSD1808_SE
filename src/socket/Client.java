package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * 
 * @author soft01
 *
 */
public class Client {
	/*
	 * java.net.Socket 封装流TCP通讯协议的细节操作，java中想完成TCP协议通讯就依靠
	 * 这个API即可。使用它与服务器链接后，通过操作两个流即可完成与 服务器的数据交换。
	 */
	private Socket socket;

	/*
	 * 构造方法用于客户端初始化操作
	 */
	public Client() {
		try {
			/*
			 * 实例化Socket时传入两个参数 1：服务端的IP地址信息 2：服务端的服务端口号
			 * 
			 * 通过IP地址可以找到服务端的计算机，通过端口号 可以找到运行在服务端计算机上的服务端应用程序。
			 * 
			 * 
			 * 实例化过程就是连接的过程，若连接失败会抛出异常。
			 */
			System.out.println("正在连接服务器...");
			socket = new Socket("localhost", 9918);
			System.out.println("已连接！");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void start() {
		ServerHandler handler=new ServerHandler();
		Thread t=new Thread(handler );
		t.start();
		try {

			/*
			 * Socket提供的方法： OutputStream getOutputStream()
			 * 该方法可以获取一条字节输出流，通过这个流写出数据会被发送给远端（这里相当 于发给了服务端）
			 */
			Scanner sc = new Scanner(System.in);
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, "utf-8");
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);

			while (true) {
				String str = sc.nextLine();

				pw.println(str);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.start();
	}

	private class ServerHandler implements Runnable {
		public void run() {
			InputStream in;
			try {
				in = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(in, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String message;
				while ((message = br.readLine()) != null) {
		
					System.out.println(message);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
