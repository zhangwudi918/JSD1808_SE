package thread;
/**
 * 线程提供了一系列获取当前线程信息的方法
 * @author soft01
 *
 */
public class ThreadInfoDemo {

	public static void main(String[] args) {
		Thread main=Thread.currentThread();  //获取当前线程方法
		long id=main.getId();    //获取线程唯一标识
		
		String name=main.getName();// 获取线程名字
		
		int priority=main.getPriority();//获取线程优先级
		boolean isAlive=main.isAlive();//是否处于活动状态
		boolean isDaemon=main.isDaemon();//是否为守护线程
		boolean isInterrupted=main.isInterrupted();//线程是否被中断
				System.out.println("id:"+id+" "+"名字:"+name+" "+"优先级:"+priority+" "+"是否处于活动状态："+isAlive+" "+"是否为守护线程："+isDaemon+" "+"是否被中断："+isInterrupted);

		
		
		
	}

}
