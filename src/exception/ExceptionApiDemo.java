package exception;

public class ExceptionApiDemo {

	public static void main(String[] args) {
 		System.out.println("程序开始了");
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));

		} catch (Exception e) {
			//输出错误i堆栈信息，有助于定位错误并改正
			e.printStackTrace();
			//获取错误信息
			System.out.println(e.getMessage());
		}
		System.out.println("程序结束了");
	}

}
