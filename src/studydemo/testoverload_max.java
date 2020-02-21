package studydemo;

import java.util.Scanner;

public class testoverload_max
{
	class max{
		int max(int a,int b) {
			return(a>b ? a:b);
			
		}
		double max(double s,double d) {
			return(s>d?s:d);
		}
		double max(double c,double x,double z) {
			return((c>x? c:x)>z? ((c>x)? c:x):z);
		}/*
		简便方法--要会
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));/*首先判断a,b大小这个条件表达式(a>b?).
		若a大则执行第一个表达式即(a>c?a:c)
		若b大则执行第二个表达式(b>c?b:c)
		*
		*
		*/
	}
	public static void main(String args[]) {
		int a=0,b=0;
		double s=0,d=0,c=0,x=0,z=0;
		Scanner op=new Scanner(System.in);
		max xp=new testoverload_max().new max();
		System.out.println("<两个int数比较大小>");
		System.out.println("请输入两个数:");
		a=op.nextInt();
		b=op.nextInt();
		System.out.println("结果为:"+xp.max(a, b));
		System.out.println("<两个double型数比较大小>");
		System.out.println("请输入两个数:");
		s=op.nextDouble();
		d=op.nextDouble();
		System.out.println("结果为:"+xp.max(s, d));
		System.out.println("三个double数比较大小");
		System.out.println("请输入三个数:");
		c=op.nextDouble();
		x=op.nextDouble();
		z=op.nextDouble();
		System.out.println("结果为:"+xp.max(c, x, z));
	}
}
