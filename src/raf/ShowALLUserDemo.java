package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 显示所有用户信息
 * @author soft01
 *
 */
public class ShowALLUserDemo {

	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("usetext.dat","r");
		for(int i=0;i<raf.length()/100;i++) {
		byte[] date=new byte[32];
		raf.read(date);
		String username=new String(date,"utf-8").trim();
		raf.read(date);
		String passworld=new String(date,"utf-8").trim();
		raf.read(date);
		String nickname=new String(date,"utf-8").trim();
		int age=raf.readInt();
		System.out.println(username+","+passworld+","+nickname+","+age);
		}
		raf.close();
	}

}
