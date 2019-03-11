package thread;

/**
 * 多线程并发的安全问题
 * 当多个线程并发操作同一资源时，由于线程切换时机的不确定和不可控，
 * 会导致操作该资源的代码逻辑执行顺序未按照设计要求运行，出现操作混乱。
 * 严重时可能导致系统瘫痪。
 * @author soft01
 *
 */
public class SyncDemo {

	public static void main(String[] args) {
		Table table=new Table();
		Thread t1=new Thread() {
			public void run() {
				while(true) {
					int bean=table.getbean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				while(true) {
					int bean=table.getbean();
					Thread.yield();
					System.out.println(getName()+":"+bean);
				}
			}
		};
		t1.start();
		t2.start();
	}

}
class Table{
	private int beans=20;
	/*
	 * 解决并发安全问题的核心就是将多个线程抢着运行改为有先后顺序的排队运行。
	 * java提供锁机制，强制多个线程同步运行一个方法
	 * 
	 * 当一个方法上使用了关键字synchronized修饰后，该方法称为同步方法，
	 * 多个线程不能同时在方法内部运行。
	 */
 public synchronized int getbean() {
		if(beans==0) {
			throw new RuntimeException("没豆子了");			
		}
		Thread.yield();//yield方法会让运行这个方法的线程立刻让出CPU时间，在这里模拟线程切换
		return beans--;
	}
}