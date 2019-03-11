package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成用户注册功能 用户信息包括：用户名，密码，昵称，年龄 其中除了年龄int外，其余均为字符串String
 * 
 * @author soft01
 *
 */
public class RegDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.nextLine();
		System.out.println("请输入密码");
		String passworld = sc.nextLine();
		System.out.println("请输入昵称");
		String nickname = sc.nextLine();
		System.out.println("请输入年龄");
		int age = Integer.parseInt(sc.nextLine());

		RandomAccessFile raf = new RandomAccessFile("usetext.dat", "rw");
		raf.seek(raf.length());
		byte[] date = username.getBytes("utf-8");
		date = Arrays.copyOf(date, 32);
		raf.write(date);

		date = passworld.getBytes("utf-8");
		date = Arrays.copyOf(date, 32);
		raf.write(date);
		date = nickname.getBytes("utf-8");
		date = Arrays.copyOf(date, 32);
		raf.write(date);

		raf.writeInt(age);
		raf.close();
	}

}
