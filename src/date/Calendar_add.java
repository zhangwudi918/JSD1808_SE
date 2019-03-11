package date;

import java.util.Calendar;

/**
 * void add(int Field,int amount) 对指定的时间分量累加指定的值。若给定的值为负数，则是减去
 * 
 * @author soft01
 *
 */
public class Calendar_add {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 3);
		calendar.add(Calendar.MONTH, 2);
		calendar.add(Calendar.DAY_OF_YEAR, 25);
		System.out.println(calendar.getTime());
		
		//将日设置成周五
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		System.out.println(calendar.getTime());
	}

}
