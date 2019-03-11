package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合可以判断是否包含给定元素，方法为：
 * boolean contains(Object o)
 * 当包含给定元素时返回true
 * @author soft01
 *
 */
public class ContainsDemo {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(new Point(2,3));
		c.add(new Point(47,7));
		c.add(new Point(1,2));
		c.add(new Point(7,8));
		c.add(new Point(2,6));
		System.out.println(c);
		/*
		 * 集合的contanis方法判断时是使用元素equals方法判断元素是否相等。
		 */
		
		Point p=new Point(2,3);
		Point p1=new Point(2,3);
		System.out.println(p.equals(p1));
		System.out.println(c.contains(p));

	}

}
