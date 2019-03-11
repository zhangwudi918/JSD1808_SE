package date;

import java.util.Calendar;

/**
 * Calendar提供里获取指定时间分量对应值的操作：
 * int get(int Field)
 * 参数为对应的时间分量，返回值为该时间分量所对应的值
 * 而时间分量Calendar提供了大量的常量来表示。
 * @author soft01
 *
 */
public class Calendar_get {
public static void main(String[] aegs) {
	Calendar calendar=Calendar.getInstance();
	int year=calendar.get(Calendar.YEAR);
	System.out.println(year);
	int month=calendar.get(Calendar.MONTH)+1;//从零开始到11
	
	int date=calendar.get(Calendar.DAY_OF_MONTH);
	/*
	 * 获取日
	 * DAY_OF_MONTH:
	 * DAY_OF_WEEK:
	 * DAY_OF_YEAR:
	 */
	int hour=calendar.get(Calendar.HOUR_OF_DAY);
	int minute=calendar.get(Calendar.MINUTE);
	int second=calendar.get(Calendar.SECOND);
	System.out.println(year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second);
	
	int d=calendar.get(Calendar.DAY_OF_YEAR);
	System.out.println("今天是今年的第"+d+"天");
	
	int dow=calendar.get(Calendar.DAY_OF_WEEK);
	String[] dat= {"日","一","二","三","四","五","六"};
	System.out.println("今天是周"+dat[dow-1]);
	
	
	int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println("今年最多有"+days+"天");
	
	
	days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println("当月共有"+days+"天");
	
	
	
}
	
}
