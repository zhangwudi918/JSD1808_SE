package proxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Person person = (Person) Proxy.newProxyInstance(Client.class.getClassLoader(), new Class[]{Person.class}, new StudentProxy(new Student()));
        person.eat();
        person.study();
        int i = person.getid(3);
        System.out.println(i);
    }
}
