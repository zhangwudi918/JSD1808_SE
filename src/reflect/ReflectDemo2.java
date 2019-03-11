package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 * 通过类对象可以获取其表示的类的一切信息，类名，有哪些属性，哪些方法，哪些构造器等。
 * 并且可以调用无参构造器快速实例化一个对象。
 */
public class ReflectDemo2 {
		public static void main(String[] args) throws InstantiationException, IllegalAccessException {
			Class cla=Person.class;
			
			//获取类中构造器
			Constructor[] constrarr=cla.getDeclaredConstructors();
			for(Constructor c:constrarr) {
				System.out.println(c);
			}
			
			
			//获取本类中方法（自己定义的）
			Method[] methodarr=cla.getDeclaredMethods();
			for(Method m:methodarr) {
				System.out.println(m);
			}
			
			Method[] methodarr1=cla.getMethods();
			for(Method m:methodarr1) {
				System.out.println(m);
			}
			
			Person p=new Person();
			System.out.println("p:"+p);
			/*
			 * Class提供了一个方法newInstance
			 * 可以调用其表示类的无参构造器进行实例化，并将其实例化的对象返回
			 */
			Object obj=cla.newInstance();
			
			System.out.println("obj:"+obj);
		}

}
