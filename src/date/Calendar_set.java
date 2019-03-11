package date;

import java.util.Calendar;

/**
 * void set(int field,int value)
 * 设置指定随时间分量为给定的值
 * @author soft01
 *
 */
public class Calendar_set {

	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTime());
		//设置年
		calendar.set(Calendar.YEAR, 2008);
		System.out.println(calendar.getTime());
		//设置月
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
		System.out.println(calendar.getTime());
		//设置日
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println(calendar.getTime());

	}

}
