package socket;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] asd= {};
		System.out.println(asd.length);
		int[] allOut = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int pw = 6;
		// 将pw从数组中删除

		for (int i = 0; i < allOut.length; i++) {
			if (allOut[i] == pw) {
				allOut[i] = allOut[allOut.length - 1];
			}
		}
		allOut = Arrays.copyOf(allOut, allOut.length - 1);
		System.out.println(Arrays.toString(allOut));
		// int[] allOut2 = new int[allOut.length - 1];
		// int index = 0;
		// for (int i = 0; i < allOut.length; i++) {
		// if (allOut[i] != pw) {
		// allOut2[index] = allOut[i];
		// index++;
		//
		// }
		//
		// }
		//
		// allOut = allOut2;
		
	}

}
