package collection;

public class TypeDemo {

	public static void main(String[] args) {
		/*
		 * 使用时指定泛型的类型，需要注意，泛型的原型就是Object
		 * 也就是说，在编译Type类时，x，y的类型就是Object，所有
		 * 泛型参数和返回值都会被改为Object
		 * 
		 * 那么这里使用时，编译器也会将泛型删除，下面实例化Type的
		 * 过程被编译器改为：
		 * Type t1=new Type（1，2）;
		 * 但是由于Type的构造方法要求参数符合泛型要求
		 * 所以编译器会在编译时检查实际参数是否符合泛型要求
		 * 不符合时编译不通过。
		 * 由于构造方法中实际参数1，2都是整数，符合这里t1指定的
		 * 泛型Integer那么编译通过。
		 */
		Type<Integer> t1 = new Type<Integer>(5, 4);
		/*
		 * 当获取以泛型定义的返回值类型数据时，编译器会自动补充造型代码，将返回值造型为泛型所指定的实际类型
		 * 下面代码会被编译器改为：
		 * int x=(Integer)t1.getX();
		 * 当然这里还会触发自动拆箱功能，代码改为：
		 * int x=((Integer)t1.getX()).intValue();
		 */
		
		
		int x=t1.getX();
		System.out.println("x:"+x);
		System.out.println(t1);
		Type<Double> t2 = new Type<Double>(5.54, 4.4);
		System.out.println(t2);
		Type<String> t3 = new Type<String>("张三", "李四");
		System.out.println(t3);
	}

}
