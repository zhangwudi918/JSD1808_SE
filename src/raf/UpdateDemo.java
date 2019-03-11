package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 修改昵称
 * 
 * 程序启动后，要求用户输入要修改的用户名，以及新的昵称 然后对该用户进行修改 若输入的用户名不存在则提示无此用户
 * 
 * @author soft01
 *
 */
public class UpdateDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();

		byte[] date = new byte[32];
		int temp = 0;
		RandomAccessFile raf = new RandomAccessFile("usetext.dat", "rw");
		for (int i = 0; i < raf.length() / 100; i++) {
			raf.seek(i * 100);
			raf.read(date); 
			String name = new String(date, "utf-8").trim();
			if (name.equals(username)) {
				System.out.println("请输入新昵称：");
				String nickname = sc.nextLine();
				byte[] nck = nickname.getBytes();
				nck = Arrays.copyOf(nck, 32);
				raf.seek(64 + i * 100);
				raf.write(nck);
				System.out.println("修改成功！");
				temp++;
			}

		}
		if (temp == 0) {
			System.out.println("用户不存在");
		}
		raf.close();
	}

}
