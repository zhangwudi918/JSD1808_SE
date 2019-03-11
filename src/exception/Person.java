package exception;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}
/*
 * 当一个方法中使用throw抛出某个异常时，就要在方法声明时使用throws
 * 声明该异常的抛出，以通知调用者必须处理该异常
 * 只有抛出RuntimeException及其子类型异常时可以不用throws。
 */
	public void setAge(int age) throws IllegalAgeException {
		if (age > 100 || age <= 0) {
			throw new IllegalAgeException("年龄不合法");
			/*
			 * 通过throw关键字可以将一个异常实例抛出方法之外，由调用该方法的代码片段来解决该异常
			 */
		}
		this.age = age;
	}

}
