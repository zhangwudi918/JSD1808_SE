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

public class Clirnt2 {
	private Socket socket;

	public Clirnt2() {
		System.out.println("正在连接服务器...");
		try {
			socket = new Socket("localhost", 9918);
			System.out.println("已连接！");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void start() {
		Thread t = new Thread() {
			public void run() {
				try {
					InputStream in = socket.getInputStream();
					InputStreamReader isr = new InputStreamReader(in, "utf-8");
					BufferedReader br = new BufferedReader(isr);
					String str;
					while ((str = br.readLine()) != null) {
						System.out.println(str);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
		Scanner sc = new Scanner(System.in);
		try {

			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw, true);
			while (true) {
				String str = sc.nextLine();

				pw.println(str);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Clirnt2 cl2 = new Clirnt2();
		cl2.start();
	}

}
