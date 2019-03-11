package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadDemo {
	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("asd.jpg", "r");
		RandomAccessFile rw = new RandomAccessFile("asd_cp.jpg", "rw");
long start=System.currentTimeMillis();
		int d = 0;
		while ((d=raf.read() )!= -1) {
			
			rw.write(d);
		}
		long end=System.currentTimeMillis();

		System.out.println("复制完毕,用时"+(end-start)+"ms");
		raf.close();
		rw.close();
		
	}
}
