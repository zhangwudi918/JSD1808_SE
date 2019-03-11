package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 自动关闭特性 jdk7之后推出的，使得我们在IO操作中的异常处理机制写法更加简洁。
 * 
 * @author soft01
 *
 */
public class AutoCloseingDemo {
	public static void main(String[] args) throws IOException {
		try (FileOutputStream fos = new FileOutputStream("fos.dat")
				/*
			 * 实现了AutoCloseable接口的类可以定义在这里。所有流和RandomAccessFile
			 * 都实现了该接口
			 * 编译器最终会将代码改为try-catch-finally的形式，并在finally中关闭这里定义的流
			 */
				
				) {
			
			fos.write(1);
		} catch (Exception e) {
			System.out.println("出错了");
		}

	}
}
