package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 * 
 * Collection提供了一个方法： Iterator iterator（） 该方法可以获取一个用于遍历当前集合元素的迭代器。
 * 
 * java.util.Iterator接口 该接口是所有迭代器的顶级接口，规定了迭代器遍历集合的统一操作。不同的集合实现
 * 类都实现里一个用于遍历自身元素的迭代器实现类。我们无需记住它们，用接口接收它们并 调用相应的遍历方法即可。
 * 
 * @author soft01
 *
 */
public class IteratorDemo {

	public static void main(String[] args) {
		Collection  c = new ArrayList();
		c.add("one");
		c.add("#");
		c.add("two");
		c.add("#");
		c.add("three");
		c.add("#");
		c.add("four");
		c.add("#");
		c.add("five");
		System.out.println(c);
		Iterator it=c.iterator();
		while(it.hasNext()) {
			/*
			 * 使用迭代器遍历集合遵循原则：
			 * 问，取，删
			 * 其中删除元素不是必须操作
			 * 
			 * boolean hasNext（）
			 * 通过迭代器判断集合是否还有元素可以遍历
			 * 
			 * E next（）
			 * 获取下一个遍历元素
			 */
			String str=(String) it.next();
			System.out.println(str);
			if("#".equals(str)) {
				//迭代器要求在遍历的过程中不得使用 集合的方法增删元素，否则会抛出异常。
			//	c.remove(str);
				it.remove();
				//可以通过迭代器提供的remove方法删除通过迭代器next出来的元素
			}
			
		}
		System.out.println(c);
	}

}
