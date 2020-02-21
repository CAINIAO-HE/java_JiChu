package day11;

import javax.crypto.SecretKey;

/*泛型类*/

public class Fanxing
{
public static void main(String args[]) {
	A<String> aa=new A<String>();
	/*一直到这，在声明A的对象时才指明了
	 * 泛型为string，则类A的数据类型T也就被确定为string
	 * 类型*/
	aa.setKey("泛型");
	String s=aa.getKey();/*
	用一个string类型的变量接收getkey()的返回值*/
	System.out.println(s);
	System.out.println("integer类型实例");
	A<Integer> ss=new A<Integer>();
	//此时A的key的数据类型就来到了integer
	ss.setKey(19);
	Integer i=ss.getKey();
	System.out.print(i);
	//泛型声明都不懈就是Object
	System.out.println("泛型声明都不懈就是Object");
	A qq=new A();
	qq.setKey(new Object());
	//可以看到此时数据类型成为了Object
	Object obj=qq.getKey();
	/*甚至同样的类，但是在new对象时泛型指定不同的
	 * 数据类型，这些对象时不能互相赋值的*/
	//ss=aa;会报错，因为数据类型不相同
	
}
}/*
此处的T是类A的泛型，
并且不知道其实何种数据类型
*/
class A<T>{
	private T key;
public void setKey(T key) {
	this.key=key;
}	
public T getKey() {
	return(this.key);
}
	
}