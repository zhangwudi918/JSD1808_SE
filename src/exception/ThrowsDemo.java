package exception;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 子类重写超类含有throws声明异常抛出的方法时的一些重写规则
 * @author soft01
 *
 */
public class ThrowsDemo {

	public void dosome()throws IOException,AWTException{
		
	}

}
class Son extends ThrowDemo{
	//允许不抛出任何异常
//	public void dosome() {
//		
//	}
	
	//允许仅抛出部分异常
//	public void dosome()throws IOException {
//		
//	}
	
	//允许抛出父类方法抛出异常的子类异常
	public void dosome() throws FileNotFoundException{
		
	}
	
}