package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取字符数据
 * @author soft01
 *
 */
public class ReadStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile far=new RandomAccessFile("zhang.txt","rw");
		byte[] date=new byte[(int)far.length()];
		far.read(date);
		String str=new String(date,"utf-8");
		System.out.println(str);
		far.close();
	}

}
