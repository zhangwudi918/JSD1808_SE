package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 重载ListFiles方法，允许我们传入一个文件过滤器 然后将目录中满足股票滤器要求的子项返回
 * 
 * @author soft01
 *
 */
public class ListFilesDemo2 {

	public static void main(String[] args) {

		/*
		 * 获取当前目录下所有名字以"."开头的子项
		 */
		File dir = new File(".");

		FileFilter filter = new FileFilter() {
			public boolean accept(File file) {
				return file.getName().startsWith(".");
			}
		};
		/*
		 * 我们将文件过滤器传递给listFiles方法，在当前代码中 看似没有显示调用过文件过滤器的accept方法，但是实际
		 * 上listFiles方法在执行过程中会回调我们传递的文件过滤器 的accept方法来完成其操作。 而这种开发模式成为：回调模式 java23种设计模式
		 */
		File[] file = dir.listFiles(filter);
		for (int i = 0; i < file.length; i++) {
			System.out.println(file[i].getName());
		}

	}

}
