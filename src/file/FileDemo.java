package file;

import java.io.File;

/**
 * java.io.file
 * File用来表示文件系统中的一个文件或目录
 * 使用File可以：
 * 1：访问其表示的文件或目录的属性信息（名字大小写等）
 * 2：创建或删除文件及目录
 * 3：访问一个目录中的子项
 * 
 * 但是File不能访问文件数据
 * @author soft01
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 访问当前目录下的demo.txt文件
		 * 
		 * 相对路径的优势是可以跨平台跨环境，但是相对路径要根据实际运行环境而定；
		 * 在eclipse中运行java程序时，eclipse指定的“当前目录”是当前程序所在的目录
		 * 这里是JSD1808_SE这个目录		 */
		File file=new File("./demo.txt");
		String name=file.getName();
		System.out.println(name);
		
		//获取长度
		long len=file.length();
		System.out.println(len);
		
		boolean cr=file.canRead();//是否可读
		
		boolean cw=file.canWrite();//是否可写
		
		boolean ih=file.isHidden();//是否隐藏
		
		
	}
}
