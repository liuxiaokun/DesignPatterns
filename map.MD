##HashMap与Hashtable的异同点

* Hashtable继承自**Dictionary**, HashMap继承自**AbstractMap**。
	``` java
	// Hashtable继承自Dictionary类
	public class Hashtable<K, V> extends Dictionary<K, V> implements Map<K, V> {
	}
	``` 
	
	``` java
	// HashMap继承自AbstractMap
	public class HashMap<K, V> extends AbstractMap<K, V>{
	}
	
	// AbstractMap实现了Map接口
	public abstract class AbstractMap<K, V> implements Map<K, V> {
	}
	```

* Hashtable是线程安全的，效率低； HashMap是线程不安全的，效率高。如果jdk版本高于1.5，多线程环境中建议使用**ConcurrentHashMap**。
	``` java
	//Hashtable的put方法签名有synchronized
	public synchronized V put(K key, V value) {
	}
	```
	``` java
	//HashMap的put方法签名没有synchronized
	public V put(K key, V value) {
	}
	```
	``` java
	// 给未同步的HashMap进行同步
	Map hashMap = new HashMap();
	Map m = Collections.synchronizeMap(hashMap);
	```
* Hashtable的key和value都不允许为null；HashMap最多允许1个null值的key，n多个null的value。
	``` java
	// Hashtable
	public synchronized V put(K key, V value) {
        
        if (key == null) {
            throw new NullPointerException("key == null");
        } else if (value == null) {
            throw new NullPointerException("value == null");
        }
        // ...
    }
	```
	``` java
	//HashMap, 方法允许key==null, 方法并没有对value进行任何调用，所以允许为null
	public V put(K key, V value) {
        if (key == null) {
            return putValueForNullKey(value);
        }
    }
	```
* HashMap把Hashtable的contains()方法去掉了，改成containsvalue()和containsKey()。因为contains()方法容易让人引起误解。
	``` java
	 /** 
	   * Returns true if this Hashtable contains the specified object as
	   * the value of at least one of the key/value pairs.
	   */
	   
	  public boolean contains(Object value) {
	        return containsValue(value);
	  } 
	```
* HashMap的**Iterator迭代器**是fail-fast迭代器，而Hashtable的**Enumeration迭代器**不是fail-fast的。
所以当有其它线程改变了HashMap的结构（增加或者移除元素），将会抛出ConcurrentModificationException，但迭代器本身的remove()方法移除元素则不会抛出ConcurrentModificationException异常。但这并不是一个一定发生的行为，要看JVM。这条同样也是Enumeration和Iterator的区别。
