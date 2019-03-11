package list;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List List接口是Collection的一个子接口，称为线性表。
 * 
 * List集合的特点：可以重复，提供了一组通过下标操作元素的方法。 
 * 常见实现类：
 *  java.util.ArrayList:数组实现，查询性能更好
 * java.util.LinkedList:链表实现，增删元素性能更好，尤其首尾增删元素效果最优。
 * 
 * @author soft01
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		System.out.println(list);
		String str = list.get(2);
		System.out.println(str);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		/*
		 * set方法，将给定元素设置到指定位置，返回值为原位置对应的元素
		 */
		list.set(2, "2");
		System.out.println(list);

	}

}
