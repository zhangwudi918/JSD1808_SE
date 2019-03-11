package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 * InputStreamReader与outputStreamWriter之所以被称为“转换流”
 * 是因为其他的高级字符流都只能连接在其他的字符流上，而不能直接连接在
 * 字节流上，而转换流是唯一可以连接在字节流上的字符流，而它们本身就是
 * 字符流，可以供其他的字符流连接，从而起到承上启下的作用。对此我们在使用
 * 其他字符流操作时，它们在流链接中是用来衔接字符流与字节流的桥梁。负责
 * 将字符与字节之间互相转换。
 * @author soft01
 *
 */
public class InputStreamReaderDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * 从osw.txt文件中读取文本数据
		 */
		FileInputStream fis = new FileInputStream("out.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
//		int d;
//		while ((d = isr.read()) != -1) {
//			char c = (char) d;
//			System.out.print(c);
//		}
		
		char[] c=new char[100];
		int len=isr.read(c);
		String str=new String(c,0,len);
		System.out.println(str);
		
		
		isr.close();
	}

}
