package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/*
 * 通过反射的方式调用方法
 */
public class ReflectDemo3 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		/*
		 * 利用反射创建对象调用方法
		 */
		//加载类对象
		Scanner sc=new Scanner(System.in);
		
		System.out.println("输入包名类名");
		Class cls=Class.forName(sc.nextLine());
		//通过类对象实例化一个无参对象
		Object obj=cls.newInstance();
		//获取无参sayHi方法
		System.out.println("输入方法名");
		Method m=cls.getDeclaredMethod(sc.nextLine());
		//调用方法  （对象   方法参数）

		m.invoke(obj);
		
	}

}
