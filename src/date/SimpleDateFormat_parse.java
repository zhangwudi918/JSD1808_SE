package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将一个字符串解析为Date
 * @author soft01
 *
 */
public class SimpleDateFormat_parse {

	public static void main(String[] args) throws ParseException {
		String str="2008-4-6 23:15:52";
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=  sdf.parse(str);
		System.out.println(date);
		
	}

}
