package studydemo;

import java.util.Scanner;

public class cylinder extends circle
{
double length;
double volume;

public cylinder() {
	length=1;
}
void setLength(double length) {
	this.length=length;
}
double getLength() {
	Scanner op=new Scanner(System.in);
	System.out.println("请输入高:");
	this.length=op.nextDouble();
	return this.length;
}
double findVolume(double n,double m) {
	//cylinder cj=new cylinder();
	//circle cj=new circle();
	
	//volume=(cj.findArea())*length;
	//this.volume=(new cylinder().findArea())*(this.length);
	this.volume=m*n;
	System.out.println(this.volume);
	return this.volume;
}
@Override/*中译为：凌驾于
可理解为这个重写方法凌驾于父类的方法当执行重写方法时父类方法被覆盖
*/
	double findArea(double radius
	) {//alt+/唤出智能提示选择要重写的父类方法然后进行重写
		// TODO Auto-generated method stub
		//return super.findArea();

	
	super.area=(super.PI)*radius*radius;
	return(super.area);
	}
}
