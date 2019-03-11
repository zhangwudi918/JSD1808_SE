package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型应用最广泛的地方就是集合，而集合中使用泛型是用来约束集合的元素类型。
 * 
 * @author soft01
 *
 */
public class CollectionDemo4 {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		for (String str : c) {
			System.out.println(str);
			}
			System.out.println("=======================");
			/*
			 * 迭代器指定的泛型与其遍历的集合指定的泛型一致即可
			 */
			Iterator<String> it=c.iterator();
			while(it.hasNext()) {
				String str=it.next();
				System.out.println(str);
			}
		
	}

}
