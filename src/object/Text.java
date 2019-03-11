package object;

public class Text {

	public static void main(String[] args) {
		Point point=new Point(1,2);
		/*
		 * Object定义了toString方法，作用是将当前对象转换成一个字符串
		 * Objecr提供的方法返回的字符串是当前对象的句柄（对象的地址信息）
		 * 没有什么实际价值。
		 * 
		 * 所以通常我们在使用toString方法时就应当重写该方法（jacaAPI提供的类都重写过该方法了
		 * 只有我们自己定义的类需要额外重写。）
		 */
		String str=point.toString();
		System.out.println(str);
		System.out.println(point);
		/*
		 * 字符串与其他对象链接时，也是调用该对象的toString方法先转换为字符串再与字符串链接的
		 */
		str="point:"+point;
		System.out.println(str);
		Point p=new Point(1,2);
		System.out.println(point==p);
		System.out.println(point.equals(p));

	}

}
