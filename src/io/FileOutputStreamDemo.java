 package io;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IO java标准的输入和输出 IO可以让我们的java程序以标准的读写方式与外界交换数据
 * 
 * 根据读写的功能划分方向 输入：用来读取数据 输出：用来u写出数据
 * 
 * java.io.InpotStream 所有字节输入流超流，本身是一个抽象类，并不能直接实例化 它规定了所有字节输入流都必须具有的读取字节数据的相关规定
 * 
 * java.io.OutputStrram 所有字节输出流的父类，是抽象类，规定所有字节输出流必须具备的写出字节方法
 * 
 * java将流分为两大类：节点流和处理流
 * 
 * 节点流： 节点流也被称为低级流，特点是：真实链接程序与数据的“管道”，负责实际读写数据的流。 读写一定时建立在低级流的基础上进行的
 * 
 * 处理流也称为高级流，其不能独立存在，必须链接在其他流上，这样当数据“流经”当前高级流时 可以对该数据做某些加工处理，简化我们对该数据的读写操作。
 * 
 * 
 * 
 * 
 * 文件流 java.io.FileInputStream与FileOutputStream 文件流是一对低级流，是用来读写文件数据的流。
 * 
 * 它们与RanomAccessFile都是用来读取文件数据的，但是底层实际的读写方式不同。
 * [流是顺序读写的]，所有使用文件流读写文件数据是不能“回头”的。文件流不具备对文件内容的编辑操作
 * 读写的灵活性而言没有RandomAccessFile强，但是基于流的特点，利用高级流可以轻松对复杂数据进行读写。
 * RandomAccessFile利用指针读写，所以可以对文件任意位置进行读写操作，从而可以进行编辑操作。
 * 
 * 
 * 
 * @author soft01
 *
 */
public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 向文件中写入数据
		 * 文件流创建时有两种写模式：
		 * 、1覆盖写模式    先清空原数据   再通过流将数据写入
		 * 2追加写模式     在FileOutputStream构造方法中再传入一个boolean参数true    原数据保留，通过流
		 * 写入数据会被追加到文件末尾
		 */
		FileOutputStream fos = new FileOutputStream("fos.txt",true);
		String str = "zhangwudizzzzzz张无敌";
		byte[] date = str.getBytes("utf-8");
		
		fos.write(date);
		System.out.println("写出完毕");
		fos.close();
	}
}