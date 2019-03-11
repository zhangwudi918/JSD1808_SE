package map;
/**
 * HashMap内部使用一个数组来保存元素，但是散列表是根据Key元素的hashcode值
 * 直接计算出其在数组的下标位置，这样就避免了查询数组过程中遍历这样的操作，所以
 * 查询效率不受数组数据量的影响。
 * 
 * hashCode方法是Object定义的方法，意味着所有类都具有该方法
 * 
 * 在HashMap的使用中存在一种情况，当两个Key的hashcode值相同（意味着它们在HashMap内
 * 部数组保存时的下标相同），但equals比较不同时（HashMap认为它们时不重复的Key）那么
 * 就会在HashMap内部的数组对应位置出现一个链表，来保存这两组键值对。
 * 由于链表的缺点是遍历速度慢，因此在HashMap中出现链表会影响查询性能。
 * 
 * Object提供的两个方法已经妥善处理了上述问题，但是有时我们定义的类会去重写equals方法，
 * API文档中Object对这两个方法的解释明确说明了上述问题，因此重写时要遵循以下原则：
 * 1：成对重写，即：当我们重写一个类的equals方法时就应当连同重写hashCode
 * 2：一致性，当两个对象的equals比较为true时，hashCode方法返回的数字必须相等。反过来虽然不是
 * 必须的，但也应当尽量保证两个对象的hashcode值相同时equlas比较也为true，否则会在HashMap使用
 * 中作为Key存在时形成链表，影响查询性能
 * 3：稳定性，当一个对象中参与equals方法比较的属性值没有发生变化的前提下多次调用hashCode方法返回的数字应当不变。
 * @author soft01
 *
 */
public class Key {
private int x;
private int y;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + x;
	result = prime * result + y;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)            
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Key other = (Key) obj;
	if (x != other.x)
		return false;
	if (y != other.y)
		return false;
	return true;
}
	
	
}
