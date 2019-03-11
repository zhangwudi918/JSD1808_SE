package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class cls=Class.forName("reflect.Person");
		
	Object o=	cls.newInstance();
	  
	Method m=cls.getDeclaredMethod("sayHi", Class.forName("java.lang.String"));//方法名     类型的类对象String.class
	
	m.invoke(o, "dagahao");
		
	}

}
