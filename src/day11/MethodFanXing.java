package day11;

import day9.test;

public class MethodFanXing
{
public static void main(String args[]) {
	Cc cc=new Cc();
	cc.test("慧慧");//这样就确定了方法的泛型
	Aa<String> aa=new Aa<String>();
	//因为Aa是定义了泛型所以在实例化时要声明泛型
	aa.test4(2);//静态方法自己定义泛型
	aa.test3(1);
	
}
}
class Cc{
	public <T> void test(T s) {
		T t=s;
		//形参类型由泛型规定
	}
	public <T> T test1(T s) {
		return s;
		/*返回值类型和形参都由泛型替代
		 * 这样就生成一个泛型方法
		 * 这样方法的数据类型由什么决定就看调用方法时的赋值了
		 * */
		
	}
	public <T> void test2(T...s) {/*
	定义多个可变参数类型的变量的方法*/
		for(T t:s) {//for each循环遍历
			System.out.println(t);
		}
	}
	
}
class Aa<E>{
	public E e;//类自己定义的泛型可用来定义类变量
	public static<E> void test3(E e) {
		
	}
	public static <T> void test4(T t) {
		/*
		 * 
		 * 在静态方法中，不能使用类定义的泛型，如果方法要使用泛型
则只能使用自己定义的*/
		System.out.println(t);
	}
	
}
