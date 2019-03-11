package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 读取person.obj。将其中对象读回来
		 */
		FileInputStream fis=new FileInputStream("person.obj");
		ObjectInputStream ois=new ObjectInputStream(fis);
		/*
		 * 对象输入流在读取了一组字节后按照其表示的结构
		 * 将其还原为对象的过程称为：对象的反序列化
		 */
		Object obj=ois.readObject();
		
		Person p=(Person)obj;
		System.out.println(p);
		ois.close();
	}

}
