package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合存放是元素的引用
 * @author soft01
 *
 */
public class CollectionDemo2 {

	public static void main(String[] args) {
		Collection c=new ArrayList();
		Point p=new Point(2,3);
		c.add(p); 
		System.out.println(c);
		System.out.println(p);
		p.setX(5);
		System.out.println(c);
		System.out.println(p);
		
		
		
	}

}
