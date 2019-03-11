package integer;
/**
 * 包装勒都支持一个静态方法：parseXXX（String str）
 * 该方法的作用是可以将字符串转换为对应的基本类型，但是前提
 * 是该字符串的内容正确描述了基本类型可以保存的值。
 * @author soft01
 *
 */
public class ParseDemo {
public static void main(String[] args) {
	String str="123";
	/*
	 * 当给定的字符串不能转换为对应的基本类型时，
	 * 会抛出NumberFormatException（数字格式异常）。
	 */
	int a=Integer.valueOf(str);
	double b=Double.parseDouble(str);
	System.out.println(a);
	System.out.println(b);

}
}