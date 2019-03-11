package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 排序字符串
 * @author soft01
 *
 */
public class SortListDemo2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("tom");
		list.add("jack");
		list.add("TOm");
		list.add("lose");
		list.add("Maik");
    list.add("bill");
    System.out.println(list);
/*
 * 字符串比较大小的规则是按照首字母的unicode编码比较，若第一个字符一样则看第二个
 * 
 */
    Collections.sort(list);
    System.out.println(list);
    	
	}

}
