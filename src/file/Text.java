package file;

import java.io.File;

public class Text {

	public static void main(String[] args) {
		File dir = new File("a");
		delete(dir);

	}
	// 第归调用删除目录

	public static void delete(File f) {
		if (f.isDirectory()) {
			File[] aa = f.listFiles();
			for (int i = 0; i < aa.length; i++) {
				delete(aa[i]);
			}
		}
		f.delete();
	}
}
