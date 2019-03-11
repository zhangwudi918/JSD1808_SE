package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 集合的排序
 * 集合有一个工具类：java.util.Collections
 * 它提供了很多方便我们操作集合的静态方法，其中一个方法是sort
 * 用于对list集合进行自然排序。
 * @author soft01
 *
 */
public class SortListDemo {

	public static void main(String[] args) {
		Random random=new Random();
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(random.nextInt(100));
			
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
