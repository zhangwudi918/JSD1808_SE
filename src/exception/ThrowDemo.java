package exception;

public class ThrowDemo {

	public static void main(String[] args) {
		System.out.println("程序开始了");
		Person p = new Person();
		try {
			/*                
			 * 当调用一个含有throws声明异常抛出的方法时，编译器要求我们必须处理该异常
			 * 而处理方式有两种：
			 * 1：使用try-catch捕获并处理该异常
			 * 2：在当前方法上继续使用throws声明该异常的抛出。
			 * 具体选取哪个取决于异常解决的责任问题
			 * 注意：不要在main方法上使用throws
			 */
			p.setAge(200);
		} catch (IllegalAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(p.getAge());
		System.out.println("程序结束了");
	}

}
