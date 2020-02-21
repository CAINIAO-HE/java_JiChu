package day11;


public class FanXinglei
{
public static void main(String args[]) {
	String name="慧慧";
	Integer age=19;
	B bb=new B();//未指定泛型，真正确定泛型是在调用方法的赋值那
	B<Integer> ba=new B<Integer>();
	//这就是另一种使用方法在实例化是指定泛型
	System.out.println(bb.test(age));
	C cc=new C();
	System.out.println(cc.test(name));
	
	
	
	
}
}
interface IB<T>{
	T test(T t) ;//抽象方法不需要方法体只需要声明
}
/*声明类时，未传入泛型实参时，与泛型类的定义相同，在声明类
 * 类的时候，需将泛型的声明也一起加到类中
 * */
class B<T> implements IB<T>{

	@Override
	public T test(
			T t
	) {
		// TODO Auto-generated method stub
		return t;
	}
	/*实现接口时若指定了泛型的具体数据类型
	 * 则这个类实现接口所有方法的位置都要泛型替换实际的具体
	数据类型(即要用到泛型的地方都会被替换成指定的数据类型)*/
	}
class C implements IB<String>{

	@Override
	public String test(
			String t
	) {
		// TODO Auto-generated method stub
		return t;
	}
	
}

	
	
