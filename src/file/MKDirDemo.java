package file;

import java.io.File;

/**
 * 创建一个目录
 * @author soft01
 *
 */
public class MKDirDemo {

	public static void main(String[] args) {

		/*
		 * 在当前目录下创建一个名为demo的目录
		 */
		File dir=new File("demo");
		if(!dir.exists()) {
			dir.mkdir() ; //创建目录
			System.out.println("目录已经创建");
		}else {
			System.out.println("目录已经存在");
		}
	}

}
