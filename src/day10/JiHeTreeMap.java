package day10;

import java.util.Map;
import java.util.TreeMap;

public class JiHeTreeMap
{
public static void main(String args[]) {
	
	Map<Integer, String> map=new TreeMap<Integer,String>();
	//�½�һ��treemap����
	map.put(1, "a");
	map.put(1, "b");//map��key�������ظ�
	map.put(2, "c");
	map.put(4, "d");
	System.out.println(map);
	//treemap�����ǰ��ֵ������
	System.out.println("treemap�����ǰ��ֵ������");
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
