package collection;
/**
 * 泛型
 * 泛型是JDK5推出的一个特性，又称为参数化类型。允许使用者在使用一个类时侯
 * 指定其定义的属性，方法的参数以及返回值的类型，这样可以使程序更灵活。
 * @author soft01
 *
 */
public class Type<T> {

	private T x;
	private T y;
	public Type(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}

}
