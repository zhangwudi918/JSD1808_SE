package string;
/**
 * static String valueOf()
 * 该方法有若干重载，参数囊括基本类型及引用类型。
 * 但是该方法作用是同样的，将给定内容转换为字符串形式。
 * 比较常用的是将基本类型转换为字符串。
 * @author soft01
 *
 */
public class ValueOfDemo {

	public static void main(String[] args) {
		int a=123;
		String str=String.valueOf(a);
		System.out.println(str);
		
	
	}

}
