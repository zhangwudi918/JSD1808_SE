package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池
 * 线程池是一个管理线程的机制，它主要解决两个问题：
 * 1：重用线程
 * 2：控制线程数量
 * 频繁的创建和销毁线程会给系统带来额外的开销，所以线程应当的以重用。
 * 当线程资源过多时，会出现资源消耗增大，CPU出现过度切换导致并发性能
 * 降低。对此线程的数量也要得以控制的在当前硬件环境所能承受的范围。
 * @author soft01
 *
 */
public class ThreadPoolDemo {
	public static void main(String[] args) {
		
		ExecutorService threadPool=Executors.newFixedThreadPool(2);
		
		for(int i=0;i<5;i++) {
			Runnable r=new Runnable() {
			public void run() {
					Thread t=Thread.currentThread();
					System.out.println(t.getName()+"正在执行任务。。。");
				
				}
			};
			threadPool.execute(r);
			System.out.println("将一个任务派给线程池");
		}
		
		threadPool.shutdown();
		System.out.println("线程池关闭");
	}
}
