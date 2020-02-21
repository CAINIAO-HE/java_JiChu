package day10;

import java.util.Map;
import java.util.TreeMap;

public class JiHeTreeMap
{
public static void main(String args[]) {
	
	Map<Integer, String> map=new TreeMap<Integer,String>();
	//新建一个treemap集合
	map.put(1, "a");
	map.put(1, "b");//map中key不允许重复
	map.put(2, "c");
	map.put(4, "d");
	System.out.println(map);
	//treemap排序是按字典排序的
	System.out.println("treemap排序是按字典排序的");
	Map<String, String> map2=new TreeMap<String,String>();
	map2.put("c","c");
	map2.put("a","a");
	map2.put("b", "b");
	map2.put("d", "d");
	map2.put("1", "1");
	map2.put("10", "10");
	System.out.print(map2);
	
	
}
}
