package io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲输出流写出字符串时的缓冲区问题
 * @author soft01
 *
 */
public class BufferedOutputStream_flush {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("bos.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		bos.write("nxhiouahsdjkhj".getBytes());
		/*
		 * void flush（）
		 * 缓冲区的flush方法会强制将缓冲区中已经缓存的数据一次性写出
		 * 频繁调用flush方法会降低写效率，但可以保证写出数据即时性，结合实际需求使用该方法。
		 * 
		 */
		bos.flush();
		System.out.println("写出完毕");
		bos.close();//close会自动调用一次flush
	}

}
