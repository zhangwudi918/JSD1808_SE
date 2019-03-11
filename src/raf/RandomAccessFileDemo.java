package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFileDemo
 * 专门用来读写文件数据的API，RAF基于指针对文件数据的读写。
 * 可以移动指针读写任意位置，所以可以灵活的对文件数据进行编辑工作。
 * 创建RAF时有两种常见模式：
 * f：只读模式
 * rw：读写模式
 * @author soft01
 *
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException   {
	
		/*
		 * 创建RandomAccessFile时常用的构造方法：
		 * RandomAccessFile（String path,String mode）
		 * RandomAccessFile（File file ，String mode）
		 * 
		 * 
		 * mode：模式，可以用"r","rw"
		 * 注意如果是只读模式，文件不存在时会抛出异常，若读写模式，则会在不存在时自动将该文件创建出来
		 */
		RandomAccessFile raf=new RandomAccessFile("raf.dat","rw");
		raf.write(256);
		System.out.println("写出完毕");
		
		raf.close();
	}
	
}
