package thread;

/*
 * 互斥锁
 * 当synchronized同时锁定多段代码片段时，并且他们指定的同步监视器对象是同一个时，
 * 那么这些代码片段之间就是互斥的，即：多个线程不能同时执行这些代码片段。
 */
public class SyncDemo4 {

	public static void main(String[] args) {
		Foo foo = new Foo();
		Thread t1 = new Thread() {
			public void run() {
				foo.methodA();
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				foo.methodB();
			}
		};
		t1.start();
		t2.start();
	}
}
class Foo {
	public synchronized void methodA() {
		System.out.println("A方法执行");
		try {
			Thread.sleep(3000);
			System.out.println("A执行完毕");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void methodB() {
		synchronized (this) {
			System.out.println("B方法执行");
			try {
				Thread.sleep(3000);
				System.out.println("B执行完毕");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


