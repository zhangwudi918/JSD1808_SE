package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 提高每次都写的数据量，减少实际发生的读写次数 可以提高读写效率。 单字节读写的模式，一般称为：随机读写 一组一组字节读写模式称为块读写
 * 
 * @author soft01
 *
 */
public class CopyDemo2 {
	/*
	 * RandomAccessFiles提供了块读写的方法
	 * 
	 * int read(byte[] date) 一次性读取给定字节数组总长度的字节量并存入到该数组中，
	 * 返回值为实际读取到的字节量，若返回值为-1，则表示文件末尾（本次没有读取到任何字节）
	 *
	 * void write(byte[] date) 一次性将给定的字节数组中所有字节写出
	 *
	 * void write(byte[] date,int index,int len) 将给定字节数组从下标index处开始的连续len个字节一次性写出
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("asd.jpg", "r");
		RandomAccessFile rw = new RandomAccessFile("asd_cp.jpg", "rw");
		long start = System.currentTimeMillis();
		byte[] date = new byte[1024 * 10];
		int len = 0;
		while ((len = raf.read(date)) != -1) {

			rw.write(date, 0, len);
		}
		long end = System.currentTimeMillis();

		System.out.println("复制完毕,用时" + (end - start) + "ms");
		raf.close();
		rw.close();

	}
}
