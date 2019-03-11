package string;

/**
 * String startWith(String str) String endsWith(String str)
 * 判断字符串是否是以给定字符串开头或者结尾的
 * 
 * @author soft01
 *
 */
public class StartWithDemo {

	public static void main(String[] args) {
		String str = "thinking in java";
		boolean starts=str.startsWith("thin");
		System.out.println(starts);
		boolean ends=str.endsWith("ava");
		System.out.println(ends);
	}

}
