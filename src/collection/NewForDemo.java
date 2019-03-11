package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JDK5推出时，推出了一个新的特性： 增强型for循环，也称为新循环，for each
 * 
 * 新循环不取代传统循环的工作，只用来遍历集合或数组
 * 
 * 注：新循环的语法JVM是不认可的，只是编译器认可， 编译器在编译源程序时会将新循环遍历改为传统方式遍历。
 * 
 * @author soft01
 *
 */
public class NewForDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		c.add("five");
		Iterator<String> it = c.iterator();
		while (it.hasNext()) {
			String str =  it.next();
			System.out.println(str);
		}
		System.out.println("===================================================");
/*
 * 新循环遍历集合就是迭代器遍历，所以在遍历过程中不要通过集合方法增删元素，否则会抛出异常。
 */
		for (String str : c) {
			// String str=(String)o;
			System.out.println(str);
		}
	}

}
