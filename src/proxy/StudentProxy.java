package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentProxy implements InvocationHandler {
    private Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }

    Object result=null;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("这是代理start");
       result= method.invoke(student,args);
        return result;
    }
}
