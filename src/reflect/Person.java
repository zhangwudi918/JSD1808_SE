package reflect;

public class Person {
	
	Person(){}
	Person(String str){
		
	}
	
	public void sayHello() {
		System.out.print("hello!");

	}
	public void sayHi() {
			System.out.println("hi!");
		}
	public void sayHi(String str) {
		System.out.println("hi!"+str);
	}
	
	public void sayHi(String str,int age) {
		System.out.println("hi!"+str+"今年："+age);
	}
}
