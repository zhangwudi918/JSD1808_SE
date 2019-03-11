package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式
 * 1：遍历所有的Key
 * 2：遍历所有的键值对（Entry）
 * 3：遍历所有的value（相对不常用）
 * @author soft01
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		//LinkedHashMap可以保证遍历元素顺序与put时顺序一致
		map.put("语文", 90);
		map.put("数学", 100);
		map.put("英语", 60);
		map.put("物理", 95);
		map.put("语文", 60);
		System.out.println(map);
		
		/*
		 * 遍历所有的Key
		 * Set<K> keyset()
		 * 将当前Map中所有的key以一个Set集合形式返回
		 * 遍历该集合等同于遍历了所有的key
		 */
		Set <String> keyset=map.keySet();
		for(String key:keyset) {
			System.out.println("key:"+key);
		}
		System.out.println("-----------------------");
		
		/*
		 * 遍历所有键值对
		 */
		Set<Map.Entry<String,Integer >> entryset=map.entrySet();
		for(Entry<String,Integer > e:entryset) {
			System.out.println(e.getKey()+","+e.getValue());
		}
		Collection<Integer> values=map.values();
		for(Integer value:values) {
			System.out.println("value:"+value);
		}
	}

}
