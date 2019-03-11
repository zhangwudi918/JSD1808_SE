package integer;
/**
 * 由于java中8个基本类型不能直接参与面向对象的开发
 * （不具有面向对象对应特征）。
 * 因此java为这8个基本类型分别提供了对应的引用类型，我们称它们为：包装类
 * @author soft01
 *
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		int a=123;
	Integer i=a;
	Integer i2=123;
	System.out.println(i==i2);
	System.out.println(i.equals(i2));
	
	
	int d=i2.intValue();
	int max=Integer.MAX_VALUE;
	int bmax=Double.MAX_EXPONENT;
	int ds=Integer.valueOf("123");
	System.out.println(ds);
	}
	
}
