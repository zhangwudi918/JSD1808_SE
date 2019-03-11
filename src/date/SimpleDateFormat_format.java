package date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.text.SimpleDateFormat
 * 可以将Date与String按照指定的日期格式进行互相转换。
 * @author soft01
 *
 */
public class SimpleDateFormat_format {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		
		
		String str="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf=new SimpleDateFormat(str);
		/*
		 * String format(Date date)
		 * 将给定Date按照当前SDF指定的日期格式转换为字符串
		 */
		
		String line=sdf.format(date);
		System.out.println(line);
		
	}
}
