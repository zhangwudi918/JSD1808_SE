package date;

import java.util.Date;

/**
 * java.util.Date
 * 日期类，其每一个实例用于表示一个确切的时间点。
 * Date内部维护一个Long值。该值为自公元1970-01-01  00：00：00到其表示的时间之间所经过的毫秒。
 * 由于Date存在时区和千年虫问题，大部分操作时间的方法在JDK.1.1版本出现时就变为过时方法，不建议
 * 再使用。
 * @author soft01
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		long time=date.getTime();
		System.out.println(time);
		
		date.setTime(0);
		System.out.println(date);
	}
}
