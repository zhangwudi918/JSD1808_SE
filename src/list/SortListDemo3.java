package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("长老师");
		list.add("传奇");
		list.add("小则老师");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		SortString(list);
		System.out.println(list);

		ArrayList<Point> l = new ArrayList<Point>();
		l.add(new Point(2, 21));
		l.add(new Point(1, 3));
		l.add(new Point(5, 7));
		l.add(new Point(3, 45));
		l.add(new Point(5, 23));
		l.add(new Point(8, 21));
		System.out.println(l);
		/*
		 * 编译不通过 因为collections的sort方法要求集合元素必须实现Comparable接口
		 * 。java提供的常用数据类型，比如包装类，字符串等都实现了这个接口 并定义了比较规则，所以可以使用，但我们定义的Point没有实现该接口
		 * 
		 * 
		 * 当我们定义的类，如Point，它并没有实现comparable接口，若我们想使用该sort方法排序，就需要实现
		 * 这个接口，并重写其中的比较方法，但这样做是不推荐的，因为这样做具有入侵性，写程序应当尽量避免入侵性 这样有利于程序扩展和重构。
		 * 
		 * 所谓入侵性指：当我们使用某个功能时，除了调用该功能方法的语句之外，该功能要求我们为其额外添加其他的代码
		 * 比如这里要求类Point实现接口并重写方法，那么这时该功能就对我们的程序具有侵入性。
		 */
		 sortPoint(l);
		 System.out.println(l);

	}
	public static void sortPoint(List <Point>list) {
		Collections.sort(list, new Comparator<Point>() {

			@Override
			public int compare(Point o1, Point o2) {
				int len1=o1.getX()*o1.getX()+o1.getY()*o1.getY();
				int len2=o2.getX()*o2.getX()+o2.getY()*o2.getY();
				
				return len1-len2;
			}
			
		});



			
			


		
	}

	/*
	 * 利用Collections重载的sort方法，额外传入比较规则（Comparator比较器）来对已经实现里Comparable接口
	 * 并定义了比较规则的元素按照我们定义的比较规则重新排序。
	 */
	public static void SortString(List<String> list) {

		Collections.sort(list, new Comparator<String>() {
			/*
			 * 该方法是用来定义o1和o2比较大小的规则. 而返回值是一个int值，该值不关注具体取值，只 关注取值范围： 正数：o1>o2 零：o1=o2
			 * 负数：o1<o2
			 * 
			 */
			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}

		});

	}

}
