package thread;
/**
 * 静态方法若使用synchronized修饰后，那么一定具有同步效果
 * @author soft01
 *
 */
public class SyncDemo3 {

	public static void main(String[] args) {
		final Boo b1=new Boo();
	  final Boo b2=new Boo();

		Thread t1=new Thread() {
			public void run() {
				b1.dosome();
			}
		};
		Thread t2=new Thread() {
			public void run() {
				b2.dosome();
			}
		};
		t1.start();
		t2.start();
	}

}
class Boo{
	public synchronized static void dosome() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+"正在运行desome方法");
		try {
			Thread.sleep(5000);
			System.out.println(t.getName()+"dosome运行结束");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}