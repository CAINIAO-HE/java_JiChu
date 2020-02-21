package studydemo;

public class chongxie_kids extends chongxie_mankids
{
@Override//重写标志
void employeed(//子类的重写
		int salary
) {  /*
    按alt +/就会进入智能提示选择要重写的父类方法然后就会自动补全这个方法.
    如这里重写的employeed方法
*/
	// TODO Auto-generated method stub
	super.employeed(salary)//这是调用父类的employeed方法
	/* * 上面这行super方法是调用了父类的方法。
	 * 是eclipse自动生成的，在运行时会运行父类的这个方法
	 * 由此若不需要运行父类的这个方法可将其注释掉
	 * */;
	if (salary==1)
	{
		System.out.println("kids should study and no job");
	} else
	{
System.out.println("you must find a job ");
	}
}
public static void main(String args[]) {
	chongxie_kids kids=new chongxie_kids();
	kids.employeed(1);
}
}
