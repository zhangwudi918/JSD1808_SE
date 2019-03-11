package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.map  查找表
 * Map体现的结构是一个多行两列的表格
 * 左列名为key，右列名为value
 * value是保存要查找的值，而对应的key是查询条件。
 * 
 * 在一个Map中key是不允许重复的。
 * 
 * 常用实现类：java.util.HashMap
 * 也称为散列表或哈希表
 * 当今世界上查询速度最快的数据结构。
 * 
 * @author soft01
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
			Map<String,Integer> map=new HashMap<String,Integer>();
			/*
			 * V put(K k,V v)
			 * 将给定的Key-Value对保存到Map中
			 * 由于Map要求Key不允许重复，那么当使用一个已有的Key保存新的value时，
			 * 那么是做替换value操作，这时put方法会将被替换的value返回。否则返回值为null
			 * 注：
			 * 若value为包装类类型时，接收put方法返回值时要使用包装类类型而不是基本类型，
			 * 避免因为自动拆箱导致空指针异常。
			 */
			Integer num=map.put("语文", 90);
			map.put("数学", 100);
			map.put("英语", 60);
			map.put("物理", 95);
			num=map.put("语文", 60);
			System.out.println(map);
			System.out.println(num);
			
			num=map.get("语文");
			System.out.println("语文："+num);
			
			num=map.get("体育");
			System.out.println("体育："+num);
			
			num=map.remove("英语");
			System.out.println(num);
			System.out.println(map);
			
			System.out.println(map.size());
			
			boolean b=map.containsKey("科学");
			System.out.println(b);
			b=map.containsValue(100);
			System.out.println(b);
	}

}
