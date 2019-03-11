package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * 对象流是一对常见的高级流，作用时可以方便我们读写任何java对象
 * 
 * 对象输出流：可以将java对象转换为一组字节后写出
 * 
 * 对象输入流：可以将一组字节读入并转换为对应的对象，读取的字节必须是对象输出流将一个对象转换的字节
 * @author soft01
 *
 */
public class ObjectOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String[] otherInfo= {"laosjhi","yanyuan"};
		
		Person p=new Person("苍老师", 18, "女", otherInfo);
		
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("person.obj");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		/*
		 * 首先Person对象经过oos的writeObject方法时，对象流按照Person
		 * 的结构将其转换为了一组字节，而这个过程称为：对象序列化
		 * 
		 * 然后这组字节再经过fos写入了文件中，那么将数据写入文件（硬盘上）这个过程称为：数据持久化
		 */
		oos.writeObject(p);  
		/*
		 * 对象输出流提供的都有方法：
		 * void writeObject（Object obj）
		 * 将给定对象转换为一组字节后写出
		 * 
		 * 需要注意，该方法要求写出对象所属的类必须实现：Serializable接口，否则会抛出：
		 * NotSerializableException这个异常
		 */
		System.out.println("写出完毕");
		oos.close();
	}

}
