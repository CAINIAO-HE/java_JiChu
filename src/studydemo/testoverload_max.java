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
		��㷽��--Ҫ��
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));/*�����ж�a,b��С����������ʽ(a>b?).
		��a����ִ�е�һ�����ʽ��(a>c?a:c)
		��b����ִ�еڶ������ʽ(b>c?b:c)
		*
		*
		*/
	}
	public static void main(String args[]) {
		int a=0,b=0;
		double s=0,d=0,c=0,x=0,z=0;
		Scanner op=new Scanner(System.in);
		max xp=new testoverload_max().new max();
		System.out.println("<����int���Ƚϴ�С>");
		System.out.println("������������:");
		a=op.nextInt();
		b=op.nextInt();
		System.out.println("���Ϊ:"+xp.max(a, b));
		System.out.println("<����double�����Ƚϴ�С>");
		System.out.println("������������:");
		s=op.nextDouble();
		d=op.nextDouble();
		System.out.println("���Ϊ:"+xp.max(s, d));
		System.out.println("����double���Ƚϴ�С");
		System.out.println("������������:");
		c=op.nextDouble();
		x=op.nextDouble();
		z=op.nextDouble();
		System.out.println("���Ϊ:"+xp.max(c, x, z));
	}
}
