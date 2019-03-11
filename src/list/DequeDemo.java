package list;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 双端队列java.util.Deque
 * 它继承自Queue，是两端都可以进出的队列
 * 
 * 常用实现类java.util.LinkedList
 */

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.offer("one");
		deque.offer("two");

		deque.offer("there");
		System.out.println(deque);

		deque.offerLast("four");
		System.out.println(deque);

		deque.offerFirst("five");
		System.out.println(deque);
		
		deque.poll();
		System.out.println(deque);

		deque.pollFirst();
		System.out.println(deque);

		deque.pollLast();
		System.out.println(deque);

	}

}
