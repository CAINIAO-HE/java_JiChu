package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//问题：用工具类collections中的sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序

public class JiHeCollection
{
public static void main(String args[]) {
	
	List<student> list=new ArrayList<student>();//第四部
	//新建一个泛型为student的list集合
	student stu1=new student(11, "张三");//第五部新建对象实体
	student stu2=new student(23, "李四");
	student stu3=new student(13, "lucy");
	student stu4=new student(35, "王五");
	list.add(stu1);//第七部把对象放入集合list
	list.add(stu2);
	list.add(stu3);
	list.add(stu4);
	//for each循环,这个是用来遍历的,查看list的自然序列
	for(student stu:list) {//把list里面的元素给stu
		System.out.println("age:"+stu.age
				+" "+"name:"+stu.name);
	}
	
	System.out.println("按comparator结果进行排序");
      Collections.sort(list, new student());
      for(student stu:list) {//把list里面的元素给stu
  		System.out.println("age:"+stu.age
  				+" "+"name:"+stu.name);
  		//据comparator产生的顺序返回集合中的最大值
  		student s=Collections.max(list, new student());
  		System.out.println("最大者:"+"年龄:"+s.age+" "+"姓名:"
  				+s.name);
  		//据comparator产生的顺序返回集合中的最小值
  		student ss=Collections.min(list, new student());
  		System.out.println("最小者:"+"年龄:"+ss.age+" "+"姓名:"+ss.name);
  		//返回指定元素在集合中出现的次数
  		System.out.println(Collections.frequency(list, stu1));
  		//用新值替换就只
  		student stu5=new student(22, "慧慧");
  		Collections.replaceAll(list, stu2, stu5);//stu2是旧值，syu5是新值
  		for(student ab:list) {
  			System.out.println("姓名:"+ab.name+" "
  					+"年龄:"+ab.age);
  		}
  	}
      }
}
class student implements Comparator<student>//第一步新建student类并且实现接口comparator
{
//比较方法
	int age;
	String name;
	public student() {
		
	}
	public student(int age,String name) {//第二部，建立构造方法
		this.age=age;
		this.name=name;
	}
	@Override
	public int compare(
			student o1, student o2
	) {//第三部重写compare方法,按年龄比较返回值
		// TODO Auto-generated method stub
		if (o1.age>o2.age)
		{
			return 1;
		} else if (o1.age<o2.age)
		{
			return -1;
		}else
		{
          return 0;
		}
		
	}
	
}