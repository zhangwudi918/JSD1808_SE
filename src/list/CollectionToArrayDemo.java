package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * collection中提供里一个方法：toArray 可以将当前集合转换为一个数组
 * 
 * @author soft01
 *
 */
public class CollectionToArrayDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		c.add("one");
		c.add("tow");
		c.add("three");
		System.out.println(c);
		//Object[] array=c.toArray();
		String[] array = c.toArray(new String[c.size()]);
		
		System.out.println(Arrays.toString(array));
	
	}

}
