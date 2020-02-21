package studydemo;

public class myDate
{
int year;
int month;
int day;
public myDate(int year,int month,int day) {//构造方法
	this.year=year;
	this.month=month;
	this.day=day;
}
@Override
	public boolean equals(
			Object obj
	) {//alt+/调出重写快捷方式
		// TODO Auto-generated method stub
	boolean value=false;
	if (obj instanceof myDate)
	{
		myDate op=(myDate)obj;//把obj强转为myDate类型对象
		if (this.year==op.year&&this.month==op.month&&this.day==op.day)
		{//因为年月日都是int所以用==,是字符型时用equals()方法
			value=true;
		}
	}
	else {
		value=false;
	}
	return value;
		//return super.equals(obj);
	
	}
public static void main(String args[]) {
	myDate aq=new myDate(2020, 2, 4);
	myDate aw=new myDate(2020, 2, 4);
	myDate date=new myDate(2019, 12, 30);
	System.out.println(aq.equals(aw));//两个对象比较
	System.out.println(aq.equals(date));
	System.out.println(aq.toString());//输出对象的内存地址
	System.out.println(new Object().toString());
}
}
