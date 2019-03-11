package list;

import java.util.LinkedList;
import java.util.List;


/**
 * List提供获取子集的操作：
 * 
 * List subList(int start,int end) 获取指定范围内子集
 * 
 * @author soft01
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);

		}
		System.out.println(list);
		List<Integer> sublist = list.subList(3, 8);
		System.out.println(sublist);

		for (int i = 0; i < sublist.size(); i++) {
			int x = sublist.get(i);
			sublist.set(i, x * 10);
		}
		System.out.println(sublist);
		/*
		 * 对子集元素操作就是对原集合对应元素的操作
		 */
		System.out.println(list);
		
		//将list集合中2-8删除
		list.subList(2, 9).clear();
		System.out.println(list);
	}

}
