package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author soft01
 *
 */
public class MKDirsDemo {

	public static void main(String[] args) {
		// 在当前目录下创建a/b/c/d/e/f目录
		File dir=new File("a/b/c/d/e/f");
		if(!dir.exists()) {
			dir.mkdirs();  //创建目录  相比mkdir()    mkdirs()能将不存在的父目录一同创建
			System.out.println("目录已经创建");
		}else {
			System.out.println("目录已经存在");
		}

	}

}
