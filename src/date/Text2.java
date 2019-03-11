package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 计算商品促销日期
 * 输入一个商品的生产日期，格式为：yyyy-MM-dd
 * 在输入该商品的保质天数
 * 然后经过程序计算该商品的促销日期，格式同上
 * 
 * 促销日期计算规则：该商品过期日前两周的周二
 * @author soft01
 *
 */
public class Text2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入生产日期：");
		String date=sc.nextLine();
		System.out.println("请输入保质期：");
		int expriation=sc.nextInt();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date da=sdf.parse(date);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(da);
		System.out.println(calendar.getTime());

		calendar.add(Calendar.DAY_OF_YEAR, expriation);
		System.out.println(calendar.getTime());

		calendar.add(Calendar.DAY_OF_YEAR, -14);
		System.out.println(calendar.getTime());

		
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		System.out.println(calendar.getTime());

		da=calendar.getTime();
		System.out.println(sdf.format(da));
		
		
		
		
		
		
		
		
		
		
	}

}
