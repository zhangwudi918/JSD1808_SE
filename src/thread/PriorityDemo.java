package thread;

/**
 * 线程优先级
 * 
 * 线程无法主动获取CUP事件短片，唯一可以干涉线程调度工作的方式u就算修改 线程优先级，最大程度的改善获取CPU时间片的几率。
 * 理论上，线程优先级越高的线程获取CPU时间片次数越多
 * 
 * 线程有10个优先级，分别由1-10表示。
 * 
 * @author soft01
 *
 */
public class PriorityDemo {

	public static void main(String[] args) {
		Thread max = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("max");
				}
			}
		};
		Thread min = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("min");
				}
			}
		};
		Thread nor = new Thread() {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println("nor");
				}
			}
		};
		max.setPriority(Thread.MAX_PRIORITY);
		min.setPriority(Thread.MIN_PRIORITY);
		max.start();
		min.start();
		nor.start();
	}

}
