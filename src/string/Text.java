package string;

public class Text {

	public static void main(String[] args) {
		String u1 = "www.baidu.com";
		String u2 = "http://www.tedu.cn";
		String u3 = "http://www.sina.com.cn";
		String s1 = getHostName(u1);
		String s2 = getHostName(u2);
		String s3 = getHostName(u3);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

	public static String getHostName(String ur1) {
		
		int indexBegin = ur1.indexOf(".")+1;
		int indexEnd = ur1.indexOf(".", indexBegin );
		return  ur1.substring(indexBegin , indexEnd);

		
	}
}
