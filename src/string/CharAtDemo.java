package string;
/**
 * char charAt(in index)
 * 返回当前字符串中给定位置处对应的字符
 * @author soft01
 *
 */
public class CharAtDemo {

	public static void main(String[] args) {
		//                     0123456789012345
		String str="thinking in java";
		char c=str.charAt(9);
		System.out.println(c);
		
		String line="上海自来水来自海上";
				for(int i=0;i<line.length()/2;i++) {
					char c1=line.charAt(i);
					char c2=line.charAt(line.length()-i-1);
					if(c1!=c2) {
						System.out.println("不是回文");
						return;
					}
				}
				System.out.println("是回文");
	}

}
