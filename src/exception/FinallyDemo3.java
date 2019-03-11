package exception;
/**
 * 请分别描述：final，finally，finalize？
 * final是关键字，用于修饰类，方法，变量
 * finally是java异常处理机制最后一步，当程序执行到try时，finally中代码必定会被执行
 * finalize方法时Object提供的方法，在类被gc回收被调用
 * @author soft01
 *
 */
public class FinallyDemo3 {

	public static void main(String[] args) {
		System.out.println(text("0")+","+text(null)+","+text(""));

	}
	public static int text(String str) {
		try {
			System.out.println("text方法执行了");
			return str.charAt(0)-'0';
		}catch(NullPointerException e){
			System.out.println("出现了空指针");
			return 1;
		}catch(Exception e) {
			System.out.println("出现了其他异常");
			return 2;
		}finally {
			System.out.println("finally执行了");
			return 3;
		}
	}

}
