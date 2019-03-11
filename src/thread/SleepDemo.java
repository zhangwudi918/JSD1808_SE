package thread;

import java.util.Scanner;

/**
 * 睡眠阻塞
 * 
 * static void sleep(long ms)
 * 该方法会让运行这个方法的线程处于阻塞状态指定的毫秒。
 * 当超时后，线程自动回到Runnable状态，等待再次获取时间片并发运行。
 * 
 * 注：一个线程进入阻塞状态时，CPU会立即释放去并发执行其他线程，直到该线程解除阻塞状态为止。
 * @author soft01
 *
 */
public class SleepDemo {

	public static void main(String[] args) {
		/*
		 * 程序启动后，输入一个数字，然后每一秒钟递减一次并输出，到0停止。
		 */
		System.out.println("请输入数字：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=num;i>=0;i--) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(num--);
		}
		System.out.println("程序结束");
	}

}
