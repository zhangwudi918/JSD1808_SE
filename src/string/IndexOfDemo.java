package string;
/**
 * int indexOf(String str)
 * 查找i给定字符串在当前字符串中的位置，若当前字符串不包含该内容则返回-1
 * @author soft01
 *
 */
public class IndexOfDemo {
public static void main(String[] args) {
	
	//                     0123456789012345
	String str="thinking in java";
	
	int index=str.indexOf("in");
	System.out.println(index);
	index=str.indexOf("in",3);
	//从指定位置开始查找
	System.out.println(index);
	index=str.lastIndexOf("in");
	System.out.println(index);
}
}
