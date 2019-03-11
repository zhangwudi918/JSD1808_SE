package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * JDK之后集合，Map推出了一个方法：foreach
 * 该方法可以使用lambda来遍历集合
 * 由于该方法是集合自身的方法进行遍历，那么如果该集合是一个并发安全的集合时，这种遍历方法
 * 是可以和其他集合操作进行互斥的，达到并发安全。
 * 原迭代器方法是不与集合自身方法互斥的，需要自行维护并发安全问题。
 * @author soft01
 *
 */
public class LambdaDemo3 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.forEach((e)->{
			
			System.out.println(e);
		});
		
		
	}

}
