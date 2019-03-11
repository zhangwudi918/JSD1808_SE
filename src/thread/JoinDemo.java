package thread;

/**
 * join方法可以协调方法之间的同步运行
 * 
 * 异步运行：代码之间没有先后顺序，各干各的。 同步运行：代码运行有先后顺序。
 * 
 * @author soft01
 *
 */
public class JoinDemo {
	public static boolean isFinish = false;

	public static void main(String[] args) {
	
		Thread download = new Thread() {
			public void run() {
				System.out.println("图片开始下载");
				for (int i = 0; i <= 100; i++) {
					System.out.println("down:已下载" + i + "%");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("下载完毕");
				isFinish = true;
			}
		};
		Thread show = new Thread() {
			public void run() {
				System.out.println("show：开始显示图片");
				try {
					/*
					 * 阻塞线程，等待调用该方法线程执行完毕后解除阻塞
					 */
					download.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (!isFinish) {
					throw new RuntimeException("图片显示失败");

				}
				System.out.println("show:显示图片完毕");
			}

		};
		download.start();
		show.start();
	}

}
