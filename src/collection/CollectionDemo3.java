package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo3 {

	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add("java");
		c1.add("c");
		c1.add("c++");
		System.out.println("c1:"+c1);

		Collection c2=new HashSet();
		c2.add("ios");
		c2.add("android");
		System.out.println("c2:"+c2);

		c1.addAll(c2);
		/*
		 * 将给定集合中的所有元素添加到当前集合中
		 */
		System.out.println(c1);
		Collection c3=new ArrayList();
		c3.add("java");
		c3.add("ios");
		System.out.println("c3:"+c3);

		System.out.println(c1.containsAll(c3));  //判断c1是否全包含c3
		
		c1.removeAll(c3);
		System.out.println("c1:"+c1);
	}

}
