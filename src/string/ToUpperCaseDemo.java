package string;
/**
 * String toUpperCase();
 * String toLowerCase();
 * 将当前字符串中英文全转成全大写或全小写
 * @author soft01
 *
 */

public class ToUpperCaseDemo {

	public static void main(String[] args) {
		String str="我爱java";
		String upper=str.toUpperCase();
		System.out.println(upper);
		String lower=str.toLowerCase();
		System.out.println(lower);
		
	}

}
