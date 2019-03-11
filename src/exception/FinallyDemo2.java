package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 在IO中使用异常处理机制
 * 
 */
public class FinallyDemo2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("fos.dat");
		try {

			fos.write(1);
		} catch (Exception e) {
			System.out.println("报错了");
		} finally {
			fos.close();
		}

	}

}
