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
	System.out.println("�������:");
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
@Override/*����Ϊ�������
�����Ϊ�����д��������ڸ���ķ�����ִ����д����ʱ���෽��������
*/
	double findArea(double radius
	) {//alt+/����������ʾѡ��Ҫ��д�ĸ��෽��Ȼ�������д
		// TODO Auto-generated method stub
		//return super.findArea();

	
	super.area=(super.PI)*radius*radius;
	return(super.area);
	}
}
