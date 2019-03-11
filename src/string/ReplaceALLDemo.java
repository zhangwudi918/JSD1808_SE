package string;
/**
 * Sring支持正则表达式方法3：
 * String replaceALL(String regex,String str)
 * 将当前字符串满足正则表达式的部分替换为给定内容。
 * @author soft01
 *
 */
public class ReplaceALLDemo {

	public static void main(String[] args) {
		String str="abc123def456ghi";
		str=str.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(str);
	}

}
