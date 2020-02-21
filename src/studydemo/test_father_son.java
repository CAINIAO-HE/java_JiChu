package studydemo;

public class test_father_son
{
	public void test(father e) {/*
	注意对象的强制类型转换发生在父类与子类之间，当两个类之间没有关系是是不能强制转换的
	*
	*/
		if (e instanceof son)//此处判断对象e是不是类son的对象，是的化就为true
		{
			son s=(son) e;/*
			  当判断e为son的对象时，由于形参是以父类声明的，要想使用子类的方法
			  还是必须把父类对象强转为子类对象。因为子类可以继承父类的方法
			  但是父类不能随便访问子类的方法属性，把父类对象强转为子类对象后就
			  可以使用子类自己的方法属性了
			*
			*/
		     s.Smethod();
		} else
		{
   e.Fmethod();
		}
	}
public static void main(String args[]) {
	father f=new father();
	son ss=new son();
	test_father_son test=new test_father_son();
	test.test(f);//输入的是父类对象就执行else部分
	test.test(ss);//输入的是子类对象就执行第一部分的代码
	test.test(new son());/*
	这是隐式声明对象的方法，当只用到一次对象时就可以这样使用
	效果和对象是一致的
	*/
}
}
