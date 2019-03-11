package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 * @author soft01
 *
 */
public class ListFilesDemo {

	public static void main(String[] args) {
		/*
		 * 获取当前目录中所有子项
		 */
		File dir=new File(".");
		if(dir.isDirectory()) {
			
			File[] subs=dir.listFiles();
			
			for(int i=0;i<subs.length;i++) {
				System.out.println(subs[i].getName());
			}
		}
	}

}
