package io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件流读取数据
 * @author soft01
 *
 */
public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("fos.txt");
		byte[] date=new byte[100];
		int len=fis.read(date);
		String str=new String(date,0,len,"utf-8");
		System.out.println(str);
		fis.close();
	}

}
