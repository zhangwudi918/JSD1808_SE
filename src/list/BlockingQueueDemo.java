package list;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 阻塞队列 阻塞队列是并发安全的队列，采取双缓冲，在并发安全的前提下解决存取互斥问题，并发效率更好
 * 
 * @author soft01
 *
 */
public class BlockingQueueDemo {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(3);
		boolean b = queue.offer("one");
		System.out.println(b);
		queue.offer("two");
		queue.offer("three");
		try {
			b = queue.offer("four", 3, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(b);
		System.out.println(queue);

	}

}
