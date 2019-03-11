package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 程序启动后，要求用户输入自己的生日，格式：yyyy-MM-dd
 * 然后通过计算，输出到今天为止一共活了多少天，以及10000天
 * 纪念日是那天，纪念格式同上
 * @author soft01
 *
 */
public class Test {
	
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		String brithday=sc.nextLine();
		String str="yyyy-MM-dd";
		Date date=new Date();
		
		
		SimpleDateFormat sdf=new SimpleDateFormat(str);
		
		Date briday=sdf.parse(brithday);
		long daybri=briday.getTime();
		long now=date.getTime()-daybri;
		long day=now/1000/60/60/24;
		System.out.println("出生为止活了"+day+"天");
		
		long day10000=daybri+(10000l*24*60*60*1000);

		date.setTime(day10000);
		System.out.println(sdf.format(date));
		
	}
	
	
}
