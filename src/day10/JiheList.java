package day10;

import java.util.ArrayList;
import java.util.List;

public class JiheList
{
public static void main(String args[]) {
	List<String> list=new ArrayList<String>();
	/*新建一个只能存string类型元素的list集合*/
	list.add("b");//第一个，索引下标为0
	list.add("d");//索引下标1
	list.add("c");//索引下标2
	list.add("a");//索引下标3
	list.add("a");//允许有重复元素
	System.out.println(list);
	System.out.println(list.get(2));
	//通过索引来访问指定位置的集合元素
	list.add(4, "f");//在指定索引下标位置插入数据
	System.out.println(list);
	System.out.println("在一个集合里面插入另一个集合");
	//在一个集合里面插入另一个集合
	List<String> aa=new ArrayList<String>();
	aa.add("123");
	aa.add("456");
	aa.add("789");
  list.addAll(2, aa);//在索引下标位置2插入集合aa
  System.out.println(list);
  System.out.println(list.indexOf("d"));
  //获取指定元素在集合中第一次出现的索引下标
  System.out.println(list.lastIndexOf("a"));
  /*
   * 获取指定元素在集合中最后一次出现的索引下标，
   * 下标都是从0开始的
   * */
  list.remove(2);//据指定下标移除元素
  System.out.println(list);
  list.set(1, "ff");//据指定下标修改元素
  System.out.println(list);
  List<String> sublist=list.subList(2, 4);
  /*根据索引下标起始位置来截取一段元素形成新的集合
   * sublist就是接受选定的元素的
   * 截取时包含开始的索引不包含结束时的
   * 即2=< x <4
   * */
  System.out.println(sublist);
}
}
