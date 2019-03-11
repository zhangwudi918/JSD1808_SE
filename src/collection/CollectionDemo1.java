package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * java.util.Collection
 * 
 * 集合框架 Collection接口是所有接口的顶级接口，规定了所有集合都应当具备的功能。 其下常见分类：
 * java.util.Lias:可重复集合，有序集合 java.util/Set:不可重复集合
 * 重复指的是元素是否重复，而标准是元素自身equals比较的结果。
 * 
 * @author soft01
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("one");
		c.add("tow");
		c.add("three");
		c.add("four");
		c.add("five");
		System.out.println(c);
		System.out.println(c.size());// size 返回当前集合的元素个数
		System.out.println(c.isEmpty());//判断集合是否为空集（集合内是否有元素）
		c.clear();  //清空集合
		
	}

}
