package thread;

/**
 * 线程 线程可以并发执行多段代码，给我们感觉好像这些代码在“同时运行”。
 * 
 * 创建线程的两种方式： 1：继承Thread并重写run方法
 * 该方法有两个不足之处：
 * 
 * 1.由于java是单继承的，这导致继承Thread后就不能再继承其它类了。
 * 在实际开发中经常会继承某个超类来复用其中的方法，这导致两者不能同时继承。
 * 
 * 2.继承线程后重写run方法来定义任务，这又导致我们将任务直接定义在线程上，使得线程只能做该任务，无法执行其他人物，重用性变差。
 * @author soft01
 *
 */
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}

class MyThread1 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) { 
			System.out.println("你是谁阿！");
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("我是查水表的！");
		}
	}
}