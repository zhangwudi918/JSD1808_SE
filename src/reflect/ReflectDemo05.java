package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo05 {
public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
	Class cls=Class.forName("reflect.Person");
	Method m=cls.getMethod("sayHi", new Class[] {String.class,int.class});
	Object o=cls.newInstance();
	m.invoke(o, new Object[] {
		"zhangsan",32	
	});

}
}
