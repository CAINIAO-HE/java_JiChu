package day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class JiHeTreeSet
{
	public static void main(String args[]) {
		
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(2);
		set1.add(5);
		set1.add(1);
		set1.add(8);
		System.out.println(set1);//TreeSet是自然排序的
		set1.remove(5);//移除5
		set1.contains(1);//判断集合存不存在1
		//set1.clear();清除集合
		System.out.println("使用迭代器遍历集合");
		//使用迭代器遍历集合
		Iterator<Integer> it=set1.iterator();//新建一个迭代器
		while (it.hasNext())//当迭代器中有下一个时
		{
			System.out.println(it.next());//依次输出元素
			
		}
		System.out.println("for each迭代集合，推荐使用");
		//for each迭代集合，推荐使用
		for(Integer i:set1) {
			System.out.println(i);
		}
	}
}
