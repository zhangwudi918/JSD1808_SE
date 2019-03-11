package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * java.util.Calhender
 * 日历类，用于操作时间的api
 * Calendar本身是一个抽象类
 * 常见实现类：GregorianCalendar，即阳历
 * 
 * 可以通过Calendar提供的静态方法：getInstance方法获取一个
 * 当前地区适用的实现类，绝大多数地区获取的都是阳历。
 * @author soft01
 *
 */
public class CalendarDemo1 {

	public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();
	
	Date date=calendar.getTime();   //将Calendar转换为Date
/*
 * Calendar.setTime(Date date)
 * 使用当前Calendar表示给定的Date所表示的日期	
 */
	System.out.println(date);
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String time=sdf.format(date);
	System.out.println(time);
	
	
	}

}
