package lambda;

/**
 * lambda表达式
 * 
 * lambda是JDK8之后推出的一个特性，让我们可以以函数式编程
 * 
 * lambda可以更简单的完成匿名内部类的创建
 * 
 * @author soft01
 *
 *         语法规则： ([参数列表])->{ 方法体 } 使用lambda创建的匿名内部类所属结构必须只能有1个抽象方法，否则无法使用。
 */
public class LamdaDemo1 {
	public static void main(String[] aegs) {
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println(1);

			}
		};

		Runnable r = () -> {
			System.out.println(1);
		};

		Runnable r2 = () -> System.out.println(1);

	}
}