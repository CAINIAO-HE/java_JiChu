package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



//import com.sun.java.util.jar.pack.ConstantPool.Entry;

public class JiHeMap
{
public static void main(String args[]) {
	Map<String, Integer> map=new HashMap<String,Integer>();
/*Map是接口用实现类hashmap来实现，由于map是按键-值对来存
 * 所以在泛型声明中应该指明键（key）和值（value）的类型。
 * 这里是键-string，值-integer*/
	map.put("a", 1);//map添加元素用put而不是add
	//map.put（key,value）；
	map.put("b", 2);
	map.put("c", 3);
	map.put("d", 3);//允许存在重复的
	System.out.println(map);
	System.out.println(map.get("b"));//根据key取值
	map.remove("a");//根据key移除值
	System.out.println(map);
	System.out.println(map.size());//map集合的长度
	System.out.println(map.containsKey("a"));
	//判断集合有没有指定的key
	System.out.println(map.containsValue(2));
	//判断当前集合是否包含指定的value
	//map.clear();清除集合
	Set<String> keys=map.keySet();/*获取map集合的key集合
	key集合获取后肯定要有一个容器存放，所以新建一个Set集合
	*/
	map.values();//获取集合的所有value值
	//遍历map集合，通过map.keySet();
	for(String key :keys) {//把keys的对象一个一个的给key
		
		System.out.println("key:"+key+" "+"value："+map.get(key));
		//获取key和value
		
	}
	//通过map。entrySet()遍历
	System.out.println("通过map。entrySet()遍历");
	Set<Entry<String,Integer>> entry=map.entrySet();
	/*entry是java。util。map
	 * set集合里面套了一个entry*/
	for(Entry<String, Integer> entry2 :entry) {
		
System.out.println("key:"+entry2.getKey()+" "+"value:"
+entry2.getValue());
	}
}

}
