package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用缓冲流提高读写效率
 * 
 * 缓冲流是一对高级流，使用它们读写数据时，无论我们的读写方式 是单字节读写还是块读写，它都能提高效率。
 * 
 * 在流链接中搭配不同的高级流可以简化我们对数据的读写操作 所谓流链接：使用高级流链接其他流，最终链接在低级流上，
 * 这样的串联操作可以对低级流上的数据做一系列的加工处理。
 * 
 * @author soft01
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("asd.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileOutputStream fos = new FileOutputStream("asd_copy2.jpg");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		/* 
		 * 缓冲流实际将读写转换成块读写操作，从而保证读写效率
		 */
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}
		System.out.print("复制完毕");
		bis.close();
		bos.close();
	}
}
