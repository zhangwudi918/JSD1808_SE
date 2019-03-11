package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAF读写基本类型数据，以及RAF基于指针的读写操作
 * 
 * RAF总是在指针指向位置要么读，要么写一个字节，并且无论是读还是写进行后指针都会自动向后移动一个字节
 * 
 * @author soft01
 *
 */
public class RandomAccessFileDemo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("abc.txt", "rw");
		long pos = raf.getFilePointer(); // 获取指针位置
		System.out.println("pos=" + pos);

		int max = Integer.MAX_VALUE;
		System.out.println(max);
		raf.write(max >>> 24);
		raf.write(max >>> 16);
		/*
		 * write方法存int类型，每次存低八位
		 */
		raf.write(max >>> 8);
		raf.write(max);

		raf.writeLong(123l);
		// raf.writeDouble(132.123);
		// raf.writeInt(max);
		// 一次性写四个字节
		System.out.println("输出完毕");
		raf.seek(4); // 移动指针操作

		System.out.println(raf.readLong());

		System.out.println("指针位置：" + raf.getFilePointer());

		raf.seek(4);
		raf.writeLong(456l);
		byte[] date=new byte[1000];
		raf.seek(0);
		System.out.println("changdu:"+raf.read(date));
		raf.seek(4);
		System.out.println(raf.readLong());
		System.out.println(raf.read());
		raf.close();

	}

}
