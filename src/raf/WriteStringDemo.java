package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 使用RAF写出字符串
 * @author soft01
 *
 *
 *String 提供了将字符串转换为字节的方法
 *byte[] getBytes():按照系统默认字符集转换
 *byte[] getBytes(String csn)
 *按照指定字符集将字符串转换为字节，常见的字符集
 *、GBK 国标编码 英文1字节  中文2字节
 *UTF-8对unicode进行编码的字符集，也称为万国码
 *其中英文1字节，汉字3字节
 */
public class WriteStringDemo {

	public static void main(String[] args) throws IOException {

		RandomAccessFile raf=new RandomAccessFile("asff.txt","rw");
		String str="张无敌";
		byte[] date=str.getBytes("utf-8");
		System.out.println(date.length);
		raf.write(date);
		System.out.println("写出完毕");
		raf.close();
	}

}
