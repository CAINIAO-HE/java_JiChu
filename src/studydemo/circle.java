package studydemo;

import java.util.Scanner;

public class circle
{
	public static final double PI=3.14;//声明常量PI
double radius;
double area;

public circle() {//构造方法将radius初始化为1
	radius=1;
}
void setRadius(double radius) {
	this.radius=radius;
}
double getRadius() {//手动获取半径
	Scanner op=new Scanner(System.in);
	/*
	实例化scanner对象都是在方法里面实现的，
	不要在类中声明，除非是在main方法里面
	*/
	System.out.println("请输入半径:");
	this.radius=op.nextDouble();
	return (this.radius);
}
double findArea(double radius) {//计算圆面积
	radius=this.radius;
	this.area=PI*(radius*radius);
	return this.area;
}
}
