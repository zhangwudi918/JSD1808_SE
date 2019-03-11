package raf;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 简易记事本工具 程序启动后，要求用户输入一个文件名，鹅安后对该文件名惊醒写操作
 * 职工哦呀用户输入每行字符串都顺序写入到该文件中，当用户单独输入了“exit”时，程序退出
 * 
 * @author soft01
 *
 */
public class Note {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String name = sc.nextLine();
		RandomAccessFile raf = new RandomAccessFile(name, "rw");

		System.out.println("请输入笔记");
		while (true) {

			String nextstr = sc.nextLine();

			if ("exit".equals(nextstr)) {
				System.out.println("程序结束！");
				raf.close();
				break;
			}
			byte[] date = nextstr.getBytes("utf-8");
			raf.write(date);
		}
	}

}
