package collection;
/**
 * 删除集合元素
 */
import java.util.ArrayList;
import java.util.Collection;

public class RemoveDemo {
	public static void main(String[] aegs) {
		Collection c = new ArrayList();
		c.add(new Point(2, 3));
		c.add(new Point(4, 3));
		c.add(new Point(2, 5));
		c.add(new Point(6, 1));
		c.add(new Point(3, 7));
		c.add(new Point(8, 3));
		System.out.println(c);
		Point p = new Point(2, 3);
		c.remove(p);
		//remove方法删除元素时是删除给定元素equals比较 为true的元素。
		//注意：List集合而言，若存在重复元素，只删除一个。
		System.out.println(c);
	}
}
