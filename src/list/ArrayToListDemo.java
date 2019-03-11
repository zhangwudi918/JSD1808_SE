package list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 数组转换为集合
 * 数组工具类Arrays提供了一个静态方法：asList
 * 可以将一个数组转换为List集合。
 * @author soft01
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		String[] array= {"one","two","three","four"};
		
		System.out.println(Arrays.toString(array));
		/*
		 * 通过Arrays的asList将数组转换的集合表示就是该数组，所以对集合元素操作就算对该数组元素操作
		 */
		List <String>list=Arrays.asList(array);
		System.out.println(list);
		list.set(1, "2");
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		//list.add("five");
		//由于数组是定长的。所以该集合不可增删元素
		List<String> list2=new LinkedList<String>(list);
		/*
		 * 所有集合都支持一个参数为Collection的构造方法，
		 * 作用是在创建当前集合的同时包含给定集合中的所有元素。
		 */
		list2.add("five");
		System.out.println(list2);
		
		
		
	}

}
