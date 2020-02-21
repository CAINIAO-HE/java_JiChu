package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JiheHashSet
{
public static void main(String args[]) {
	Set set=new HashSet();//新建一个hashset集合
	set.add(1);/*添加元素1，
	
	尽管集合只能存对象，但是这里是把int型的数据转换为对象了所以可以存，其他数据类型亦如此*/
	set.add(2);
	set.add(3);
	set.add("a");
	set.add("b");
	set.add("b");//会发现hashset集合中并没有两个b，因为不许重复。重复的存不进去
	set.add(null);//hashset允许存null，并且放在第一个
	System.out.println(set);//输出集合
	set.remove(2);//移除元素2
	System.out.println(set);
	System.out.println(set.contains(1));//判断set集合里面有没有元素1，返回Boolean值
	//set.clear();//清空集合
	System.out.println(set);
	//用迭代器遍历集合
	  System.out.println("用迭代器遍历集合");
	Iterator it=set.iterator();//新建一个迭代器
	while (it.hasNext())//当迭代器中有下一个时
	{
		System.out.println(it.next());//就输出
		
	}
     System.out.println("for each迭代集合");
//for each迭代集合,推荐使用
	for(Object obj :set) {//新建一个Obj对象然后把这条集合里面的元素付给obj
		System.out.println(obj);//输出元素
	}
	System.out.println("集合元素个数:"+set.size());//获取集合元素个数
	System.out.println("要想集合只能存相同元素就用泛型");
	//要想集合只能存相同元素就用泛型
	
	Set<String>opSet=new HashSet<String>();//只存string类型,则不能存string类型外的对象
	Set<Object> aa=new HashSet<Object>();/*可以存所有类型
	还有一种方法就是不在类型限制里面写任何东西，比如最开始命名集合set那种*/
	
}
}
