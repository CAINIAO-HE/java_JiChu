package studydemo;

import java.util.Scanner;

public class circle
{
	public static final double PI=3.14;//��������PI
double radius;
double area;

public circle() {//���췽����radius��ʼ��Ϊ1
	radius=1;
}
void setRadius(double radius) {
	this.radius=radius;
}
double getRadius() {//�ֶ���ȡ�뾶
	Scanner op=new Scanner(System.in);
	/*
	ʵ����scanner�������ڷ�������ʵ�ֵģ�
	��Ҫ��������������������main��������
	*/
	System.out.println("������뾶:");
	this.radius=op.nextDouble();
	return (this.radius);
}
double findArea(double radius) {//����Բ���
	radius=this.radius;
	this.area=PI*(radius*radius);
	return this.area;
}
}
