package list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * java.util.Queue接口
 * Queue是队列，其继承自Collection
 * 队列可以保存一组元素，但是存取元素必须保证先进先出原则
 * 
 * 常用实现类java.util.LinkedList
 * @author soft01
 *
 */
public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> queue=new LinkedList<String>();
		queue.offer("one");
		queue.offer("two");
		queue.offer("three");
		queue.offer("four");
		System.out.println(queue);
		//poll方法：出对操作  获取并删除对首元素
		//peek方法：获取但不删除对首元素
		String str=queue.poll();
		System.out.println(str);
		System.out.println(queue);
		
		/*
		 * 队列也是集合，可以用迭代器遍历，并且不影响队列中元素
		 */
		for(String s:queue) {
			System.out.println(s);
		}
		
		
		Iterator it=queue.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

	
}
