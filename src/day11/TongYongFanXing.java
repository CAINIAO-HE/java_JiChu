package day11;

import java.util.ArrayList;
import java.util.List;

public class TongYongFanXing
{
public static void main(String args[]) {
	//泛型通配符
	List<String> li=new ArrayList<String>();
	/*
	 * 新建了一个string类型的集合
	 * 此时就声明了集合的数据类型
	 * 
	 * 
	 * */
	li.add("张三");
	li.add("慧慧");
	li.add("王五");
	li.add("小六");
	Qq qq=new Qq();
	qq.test1(li);
	//声明了integer类型的集合
	List<Integer> in=new ArrayList<Integer>();
	in.add(10);
	in.add(12);
	in.add(14);
	in.add(1);
	qq.test1(in);
	
}
}

class Qq{
	public void test1(List<?> list) {
		/*test方法需要一个list集合参数
		 * 但是不知道元素类型所以就用?来表示
		 * 输入什么类型就转为那个类型*/
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	}
}