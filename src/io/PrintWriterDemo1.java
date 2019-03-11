package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * java,io,PrintWriter
 * 具有自动行刷新的缓冲字符输出流
 * 注：java.io.BufferedWriter是缓冲字符输出流，PW总是会在内部链接它来完成
 * 缓冲工作，而PW在其基础上还支持自动的行刷新操作，所以更为常用。
 * 
 * 缓冲字符输出流除了写出字符效率高之外，还可以按行写出字符串（写出个字符串后会自动添加换行符）
 * @author soft01
 *
 */
public class PrintWriterDemo1 {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		PrintWriter pw=new PrintWriter("pw.txt","utf-8");
		pw.println("让我掉下眼泪的");
		pw.println("不止昨夜的酒");
		System.out.println("输出完毕");
pw.close();
	}

}
