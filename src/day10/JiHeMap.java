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
/*Map�ǽӿ���ʵ����hashmap��ʵ�֣�����map�ǰ���-ֵ������
 * �����ڷ���������Ӧ��ָ������key����ֵ��value�������͡�
 * �����Ǽ�-string��ֵ-integer*/
	map.put("a", 1);//map���Ԫ����put������add
	//map.put��key,value����
	map.put("b", 2);
	map.put("c", 3);
	map.put("d", 3);//��������ظ���
	System.out.println(map);
	System.out.println(map.get("b"));//����keyȡֵ
	map.remove("a");//����key�Ƴ�ֵ
	System.out.println(map);
	System.out.println(map.size());//map���ϵĳ���
	System.out.println(map.containsKey("a"));
	//�жϼ�����û��ָ����key
	System.out.println(map.containsValue(2));
	//�жϵ�ǰ�����Ƿ����ָ����value
	//map.clear();�������
	Set<String> keys=map.keySet();/*��ȡmap���ϵ�key����
	key���ϻ�ȡ��϶�Ҫ��һ��������ţ������½�һ��Set����
	*/
	map.values();//��ȡ���ϵ�����valueֵ
	//����map���ϣ�ͨ��map.keySet();
	for(String key :keys) {//��keys�Ķ���һ��һ���ĸ�key
		
		System.out.println("key:"+key+" "+"value��"+map.get(key));
		//��ȡkey��value
		
	}
	//ͨ��map��entrySet()����
	System.out.println("ͨ��map��entrySet()����");
	Set<Entry<String,Integer>> entry=map.entrySet();
	/*entry��java��util��map
	 * set������������һ��entry*/
	for(Entry<String, Integer> entry2 :entry) {
		
System.out.println("key:"+entry2.getKey()+" "+"value:"
+entry2.getValue());
	}
}

}
