package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 字符流
 * 
 * java按照流读写的数据单位划分为：字节流和字符流 由于读写文本数据是一件非常频繁的操作，对于java专门设计
 * 了一套流，字符流。字符流是以字符为单位读写数据的，虽然底层 实际上还是读写字节（因为计算机只有二进制），但是字节与字符之间
 * 转换工作字符流自行完成了，对此也要注意到字符流的局限性，仅适合读写文本数据
 * 
 * java.io.Reader和java.io.writer 这两个类也是抽象类，它们分别是所有字符输入流和字符输出流的超类
 * 规定了字符流读写字符的相关方法。
 * 
 * 转换流： java.io.InputStreamReader,java.io
 * 它们是字符流的一对常用实现类，在使用字符流读写数据时，作为流链接的重要一环存在。
 * 但是及应用时我们通常不会直接操作这两个流（因为其上还会链接其他高级的字符流）
 * 
 * @author soft01
 *
 */
public class OutputStreamWriterDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("out.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("在一瞬间由一百万种可能");
		osw.write("是人是狗都会秀");
		System.out.println("写出完成");
		osw.close();
	}

}
