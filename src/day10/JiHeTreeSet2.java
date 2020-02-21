package day10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class JiHeTreeSet2
{
public static void main(String args[]) {//当main方法不写全时会运行上一个运行过的类
	
	person p1=new person("章三", 23);
	person p2=new person("李四", 20);
	person p3=new person("王五", 16);
	person p4=new person("lucy", 29);
	Set<person>set=new TreeSet<person>(new person());
	/*<person>时候泛型,即只存person对象
	 * 用new person()的原因，构造方法能传一个comparator比较器的参数
	 * 按传参的比较器的定义来排序
	 * */
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	//for each 迭代
	for(person p:set) {
		System.out.println(p.name+"  "+p.age);
	}
}
}
class person implements Comparator<person>{
/*把person对象存到TreeSet中并且按照年龄排序
 * comparator是比较器*/
    int age;
    String name;
   public person(String name,int age) {
	   this.age=age;
	   this.name=name;
   }
   public person() {
	   
   }
   //实现接口都要重写接口里面的方法
	@Override
	public int compare(
			person o1, person o2
	) {//按年龄正序排列
		// TODO Auto-generated method stub
		//return 0;
		if (o1.age>o2.age)
		{
			return 1;
		} else if(o1.age<o2.age)
		{
    return -1;
		}
		else {
			return 0;
		}
	}
	
	
}