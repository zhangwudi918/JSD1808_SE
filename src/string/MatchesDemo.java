package string;
/**String支持正则表达式的方法一：
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足各式要求
 * 满足则返回true，不满足则返回false
 * 
 * 需要注意！！！
 * 给定的正则表达式，无论是否添加了边届匹配符（^……$）
 * 都是做全匹配验证
 */


public class MatchesDemo {
	public static void main(String[] args) {

		String str = "1106157816@qq.com";
		String matches = "[a-zA-Z0-9_]+@+[A-Za-z0-9]+([\\.a-zA-Z]+)+";
		boolean match = str.matches(matches);
		if (match) {
			System.out.println("shi");
		} else {
			System.out.println("bushi");
		}
		
	}
	
	
	
}
