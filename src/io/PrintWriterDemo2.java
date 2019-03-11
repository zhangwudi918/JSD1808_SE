package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 在流链接中使用PrintWriter
 * @author soft01
 *
 */
public class PrintWriterDemo2 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos=new FileOutputStream("pw_1.txt");
		OutputStreamWriter osw=new OutputStreamWriter(fos);
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		pw.print("张无敌");
		System.out.println("写出完毕");
		pw.close();
	}

}
