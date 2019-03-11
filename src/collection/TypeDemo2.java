package collection;
/**
 * 泛型常见面试问题
 * @author soft01
 *
 */
public class TypeDemo2 {

	public static void main(String[] args) {
		Type<Integer> t1=new Type<Integer>(1,2);
		t1.setX(2);
		int x=t1.getX();
		System.out.print(x);
		//不指定泛型默认为原型Object
		Type t2=t1;
		t2.setX("yi");
		/*
		 * 这里出现异常
		 */
		x=t1.getX();
		System.out.println("x:"+x);
	}
	
	
}
