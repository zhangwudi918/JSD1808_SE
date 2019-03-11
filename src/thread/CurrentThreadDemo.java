package thread;
/**
 * Thread提供了一个静态方法：
 * static Thread currentThread()
 * 该方法可以获取运行这个方法的线程。
 * 
 * 后期常用的一个API：ThreadLocal里面就会用到这个方法来实现功能。
 * @author soft01
 *
 */
public class CurrentThreadDemo {
	public static void main(String[] args) {
		Thread main=Thread.currentThread();
		System.out.println(main);
		dosome();
		Thread t=new Thread() {
			public void run() {
				Thread t=Thread.currentThread();
				System.out.println(t);
				dosome();
			}
		};
		t.start();
	}
	public static void dosome() {
		Thread d=Thread.currentThread();
		System.out.println(d);
	}
}
