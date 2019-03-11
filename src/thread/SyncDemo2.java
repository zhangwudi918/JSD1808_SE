package thread;

/**
 * 同步块 有效的缩小同步范围可以在保证并发安全的前提下尽可能提高并发效率
 * 
 * 语法： synchronized(同步监视器对象){ 需用同步运行的代码片段 }
 * 
 * @author soft01
 *
 */
public class SyncDemo2 {

	public static void main(String[] args) {
		Shop shop = new Shop();

		Thread t1 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				shop.buy();
			}
		};
		t1.start();
		t2.start();
	}

}

class Shop {
	//在方法上加synchronized,那么同步监视器对象就是当前方法所属对象，即方法中看到的this
	public void buy() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName() + "在挑衣服");
		try {
			Thread.sleep(3000);
			/*
			 * 同步块有一个要求，多个线程看到的同步监视器对象必须是同一个！
			 * 否则没有同步运行效果。具体使用哪个对象可以结合将来实际开发需求而定。
			 */
			synchronized (this) {
				System.out.println(t.getName() + "在换衣服");
				Thread.sleep(3000);
			}

			System.out.println(t.getName() + "结帐离开");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}