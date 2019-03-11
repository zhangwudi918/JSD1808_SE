package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("asd.jpg");
		FileOutputStream fos = new FileOutputStream("asd_copy.jpg");

		byte[] date = new byte[1024 * 10];
		int len;

		while ((len = fis.read(date)) != -1) {

			fos.write(date, 0, len);

		}
		System.out.println("复制完毕");
		fis.close();
		fos.close();
	}

}
