package string;

import java.util.Arrays;

/**
 * String支持正则表达式二：
 * String[] split(String regex)
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的
 * 内容以String数组形式返回
 * @author soft01
 *
 */
public class SplitDemo {

	public static void main(String[] args) {
		String str="abc123def456ghi";
		String[] array=str.split("[0-9]+");
		System.out.println(Arrays.toString(array));
		
		
		/*
		 * 在拆分时若连续匹配到拆分内容，则中间会拆分出一个空字符串。但是在
		 * 字符串末尾连续匹配的话拆分的空字符串会全部忽略
		 */
		str="1,2,3,,,,,4,5,6,7,8,,,,";
	//	str="1,2,3,4,5,6,7,8,,,,,,,,";
		array=str.split(",");
		System.out.println(Arrays.toString(array));
	}

}
