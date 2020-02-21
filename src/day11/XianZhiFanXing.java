package day11;

import java.util.ArrayList;
import java.util.List;

public class XianZhiFanXing
{
	
public static void main(String args[]) {
	List<Bz> li1=new ArrayList<Bz>();
	List<D> li2=new ArrayList<D>();
	List<Ca> li3=new ArrayList<Ca>();
	List<E> li4=new ArrayList<E>();
	List<F> li5=new ArrayList<F>();
	test t1=new test();
	t1.test1(li1);//使用test1方法时输入B型list集合的形参不会报错，表明能使用
	t1.test1(li2);//以B的子类D类为数据类型的list集合能够被添加到test1方法的形参中
	//t1.test1(li3);这种会报错，因为C类不是B类的子类
	t1.test2(li3);//这种就是可以使用以C类为数据类型的list集合的方法
	t1.test2(li4);//E类是C类的子类所以可以使用集合li4
	t1.test3(li4);//只允许类E及其父类调用,li4是以E类为数据类型创建的list集合
	t1.test3(li3);//C类是E类的父类
	t1.test4(li5);//F类实现了comparable接口所以test4方法能够使用以F类为数据类型的list集合
	
	
}
}
	class test{
		public void test1(List<?extends Bz>list) {//<? extends B>list集合的参数类型为B类及其子类
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test2(List<? extends Ca>list) {//<?extends C>list集合的参数类型为C类及其子类
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test3(List<?super E>list) {//<?super E>list集合的参数类型为E类及其父类
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test4(List<? extends Comparable<String>>list) {//list集合的参数类型为实现了comparable接口的类
		//只允许实现了comparable接口的类调用
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
}
class Bz{
	int a;
	}

class Ca{
	int c;
}
class D extends Bz{
	
}
class E extends Ca{
	
}
class F implements Comparable<String>{

	@Override
	public int compareTo(
			String o
	) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}