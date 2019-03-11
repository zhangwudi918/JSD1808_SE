package file;

import java.io.File;

/**
 * 删除一个文件
 * @param args
 */
public class DeleteFileDemo {

	public static void main(String[] args) {
		/*
		 *  将当前项目路径目录下的test.txt文件删除
		 *  在相对路径中，"./"是可以忽略不写的，默认
		 *  就是从当前目录开始
		 */
		File file=new File("text.txt");
		if(file.exists()) {
			file.delete();
			System.out.println("文件已经删除");
		}else {
			System.out.println("文件不存在");
		}
		
	}

}
