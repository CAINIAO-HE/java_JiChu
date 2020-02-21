package day10;

public class AException
{
	class A{
		int i;
	}
public static void main(String args[]) {
	A test=null;
	String[] aa=new String[] {"a","b"};//只有两个数据，下标为0,1
//   try
//{
//	System.out.println(aa[2]);	//必定会异常，数组越界,且此处异常发生后不会执行下面这个空指针异常
//	 System.out.println(test.i);//空指针异常
//} catch (Exception e)//因为不知道异常的类型所以用所有异常类的父类Exception来实例化异常对象
//{
//	// TODO: handle exception
//	e.printStackTrace();//用来跟踪异常事件发生时执行堆栈的内容
//	System.out.println(e.getMessage());//输出有关异常信息
//}
	try
	{
		System.out.println(aa[2]);
		 System.out.println(test.i);
	} catch (ArrayStoreException e1)
	{
		System.out.println(e1.getMessage());
		e1.printStackTrace();
		
		// TODO: handle exception
	}
	catch (NullPointerException e2) {
		System.out.println(e2.getMessage());
		e2.printStackTrace();
		
		// TODO: handle exception
	}
 
}
}
