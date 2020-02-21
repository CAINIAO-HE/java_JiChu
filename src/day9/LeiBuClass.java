package day9;

public class LeiBuClass
{
	/*当类A要拥有类B，类C的方法并且重写执行方法时，常规的继承是不行的，因为java不支持多重继承，即一个类同时
	 * 继承两个及以上类。这个时候就可以用到内部类了，在A类内部声明两个类分别继承B类和C类然后再重写方法
	 * 然后A的对象便可以调用这些重写的方法
	 * 
	 * */
	public static void main(String args[]) {
		A a=new A();/*注意一个文件里面同时并列了多个类的话其他类是不能加public private和protected的
		可以这样想只有是类的成员才会有这些修饰符而这些并列的类并不是他的成员
		如public class B{}写并列的类这样是错误的，放在LeiBuClass类里才是正确的
		*/
		a.test();
		
	}
	}
 class A{
	//内部类可以声明为private，protected，final，static
	public void test() {
	new Innerb().showInfoB();/*
	new Innerb()是隐匿对象声明，innerb是内部类，
	类A可以像访问成员一样访问这些内部类。进而达到类A同时变相的继承了类B和类C进而使用他们的方法和属性
	*/
	new Innerc().showInfoC();
	}
private class Innerb extends B{//声明Innerb以继承类B然后重写B的方法，进而类A变相的继承了类B
	@Override
	//alt+/唤出重写
	public void showInfoB() {
		System.out.println("这是重写的B的方法");
	}
}
private class Innerc extends C{
	@Override
	public void showInfoC(
	) {
		// TODO Auto-generated method stub
		//super.showInfoC();
		System.out.println("这是重写的C的方法");
	}
}
}
 class B{
	public void showInfoB() {
		
	}
}
 class C{
	public void showInfoC() {
		
	}
}


