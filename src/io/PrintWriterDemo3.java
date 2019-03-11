package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author soft01
 *
 */
public class PrintWriterDemo3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入文件名");
		PrintWriter pw = new PrintWriter(sc.nextLine());
		/*
		 * 在流链接中创建PrintWriter时，支持第二个参数
		 * 第二个参数为boolean，若为true，则表示创建的PrintWriter为自动刷新行模式。
		 * 即：每当调用println方法写出一行字符串后就会自动进行flush操作
		 * 注意：print不会flush
		 */
		System.out.println("请输入笔记");
		while (true) {
			String next = sc.nextLine();
			if ("exit".equals(next)) {
				System.out.println("程序结束");
				sc.close();
				pw.close();
				break;
			}

			pw.println(next);
		}
	}

}
