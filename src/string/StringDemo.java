package string;

public class StringDemo {
/*
 * JVM对String有一个优化措施，即，常量池
 * java推荐我们使用“字面量”形式创建字符串对象，因为当
 * 我们这样做时虚拟机会首先检查常量池中是否有创建过有该内容
 * 的字符串对象，若有，则直接重用对象。这样做可以减少内存中大量
 * 重复字符串对象带来资源消耗问题。
 */

	public static void main(String[] args) {


		String s1="123abc";
		String s2="123abc";
		String s3="123abc";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		
		//new   强制创建对象
		String s4= new String("123abc");
		System.out.println("s4="+s4);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		/*
		 * 字符串是不变对象，创建后内容不可改变，若改变必须创建新对象
		 */
		String s5=s1;
		s1=s1+"!";
		System.out.println(s5);
				
		/*
		 * 编译器有一个优化措施。在编译源代码时若发现一个计算表达式参与的值都是字面量时
		 * 会直接进行计算并将结果编译到class文件中，所以下面的代码会被编译器改为
		 * String s6="123"+"abc";
		 * 有时候用一个计算表达式更能说明赋值的意义，而编译器会在编译时进行运算，对于
		 * JVM运行代码时没有任何差别。
		 */
		String s6="123"+"abc";
		System.out.println("s6="+s6);
		System.out.println(s2==s6);
		
		String s="123";
		String s7=s+"abc";
		System.out.println(s2==s7);
		
	}

}
