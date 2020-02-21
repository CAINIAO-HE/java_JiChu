package day9;



public abstract class Templet
{
	public abstract void code();//要把这个抽象方法声明写在调用的前面让系统先编译，放在调用后面会乱套
	
public final void getTime() {
	long start=System.currentTimeMillis();
	code();
	long end=System.currentTimeMillis();
	System.out.println("执行时间:"+(end-start));
}

}
