package string;
/**
 * 由于String的设计不适合频繁修改，对此java提供了一个
 * 用于编辑字符串内容的类：StringBuilder
 * StringBuilder内部维护了一个可变的字符数组，不会每次修改都创建新对象。从而降低资源开销
 * 提高执行效率。其提供了方便编辑字符串内容的相关方法，包含：增，删，改，插等常见操作。
 * @author soft01
 *
 */
public class StringBuilderDemo {

	public static void main(String[] args) {

		String str="好好学习java";
		/*
		 * 常见构造方法：
		 * StringBuilder（）：无参，默认表示空字符串
		 * StringBuilder（String str）：表示给定内容
		 */
		StringBuilder builder=new StringBuilder(str);
		System.out.println(builder);
//增
		builder.append(",为了找个好工作！");
		String s=builder.toString();
		System.out.println(s);
	//改	
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder.toString());
	//删	
		builder.delete(0, 8);
		System.out.println(builder.toString());
		//插
		builder.insert(0,"活着");
		System.out.println(builder.toString());
	}

}
