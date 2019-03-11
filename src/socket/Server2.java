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

public class Server2 {
	ServerSocket socket;
	ArrayList<PrintWriter> list = new ArrayList<PrintWriter>();

	public Server2() {
		System.out.println("正在启动服务器...");
		try {
			socket = new ServerSocket(9918);
			System.out.println("服务器启动成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void start() {
		try {
			while (true) {
				Socket s = socket.accept();
				System.out.println("有一个客户端连接！！！！");
				RunSock sock = new RunSock(s);
				Thread t1 = new Thread(sock);
				t1.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Server2 sv2 = new Server2();
		sv2.start();
	}

	private class RunSock implements Runnable {
		private Socket s;
		private String host;

		public RunSock(Socket s) {
			this.s = s;
			InetAddress address = socket.getInetAddress();
			host = address.getHostAddress();
		}

		public void run() {
			PrintWriter pw = null;
			try {
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is, "utf-8");
				BufferedReader br = new BufferedReader(isr);
				String str;
				OutputStream os = s.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
				BufferedWriter bw = new BufferedWriter(osw);
				pw = new PrintWriter(bw, true);
				synchronized (list) {
					list.add(pw);
				}
				while ((str = br.readLine()) != null) {
					System.out.println(host + "说：" + str);
					synchronized (list) {
						for (PrintWriter a : list) {
							a.println(host+"说："+str);
						}
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				synchronized (list) {
					list.remove(pw);
				}
				try {
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
