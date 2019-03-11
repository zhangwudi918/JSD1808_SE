package list;

import java.util.LinkedList;
import java.util.List;

/*
 * List提供了一对重载的add，remove方法。都是支持下标操作对应元素
 */
public class ListDemo2 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
System.out.println(list);
list.add(2,"2");
/*
 * void add(int index,E e)
 * 在指定位置插入给定元素
 */
System.out.println(list);
list.remove(2);

System.out.println(list);
	}

}
