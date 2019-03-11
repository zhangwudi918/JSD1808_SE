package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args)  throws IOException  {
		FileInputStream fis = new FileInputStream("src/io/BufferedReaderDemo.java");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String str;
		/*
		 * BR提供的方法：
		 * String readLine（）
		 * 连续读取若干字符，直到读取到了换行符为止，然后
		 * 将读取字符以字符串形式返回。
		 * 注意：返回字符串中不包含换行符。
		 * 当返回值为null时，表示读取到了文件末尾。
		 */
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		br.close();

	}

}
