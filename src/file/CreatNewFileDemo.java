package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * 
 * @author soft01
 *
 */
public class CreatNewFileDemo {

	public static void main(String[] args) throws IOException {

		File file = new File("./text.txt");
		/*
		 * boolean exists(); 判断当前File表示的文件或目录是否已经存在
		 */
		if (!file.exists()) {
			
			file.createNewFile();// 创建该文件   需要注意，创建文件所在目录必须存在，否则会抛出异常
			System.out.println("文件已经创建");
		} else {
			System.out.println("文件已经存在");
		}
	}

}
