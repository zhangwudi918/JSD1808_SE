package list;

import java.util.Deque;
import java.util.LinkedList;

/*
 * 栈
 * 栈也可以保存一组元素，存取必须遵循先进后出原则
 * （双端队列）
 * 使用栈一般是为了实现如“后退”这样的功能
 */
public class StackDemo {

	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<String>();
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		System.out.println(stack);
		for(String s:stack) {
			System.out.println(s);
		}
		String str=stack.pop();
		System.out.println(str);
		System.out.println(stack);
	}

}
