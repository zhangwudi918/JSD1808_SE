package thread;

public class SleepDemo2 {

	public static void main(String[] args) {
		/*
		 * jdk8之前，有一个要求，即：
		 * 当一个方法中的局部内部类想引用这个方法的其他局部变量，那么这个变量必须是final的。
		 * 
		 * 好比main方法中的局部内部类huang中的run方法里，引用了main方法局部变量lin，那么
		 * 这个变量必须声明为final的。
		 * 
		 */
		Thread lin = new Thread() {
			public void run() {
				System.out.println("林：睡会儿");
				try {
					/*
					 * 当一个线程调用sleep方法处于阻塞状态时，其他线程调用该线程的中断方法时， 那么该线程的sleep方法会立即抛出中断异常并打断睡眠阻塞。
					 */
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					System.out.println("林：被砸醒，破相了");
				}
				System.out.println("林：醒了！");
			}
		};
		Thread huang = new Thread() {
			public void run() {
				System.out.println("黄：开始砸墙");
				for (int i = 0; i < 5; i++) {
					System.out.println("黄：80！");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("咣当！搞定");
				lin.interrupt();

			}
		};
		lin.start();
		huang.start();
	}

}
