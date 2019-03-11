package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的内容
 * 注：在java API中通常使用两个数字表示范围时，都是含头不含尾的
 * @author soft01
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		String str="www.tedu.cn"; 
		String sub=str.substring(4,8);
		System.out.println(sub);
		sub=str.substring(4);
		System.out.println(sub);
	}

}
