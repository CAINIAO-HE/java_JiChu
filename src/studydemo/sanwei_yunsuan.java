package studydemo;

import java.util.Scanner;


public class sanwei_yunsuan {
	public static void main(String args[]) {
		/*三元运算公式:(条件表达式)?表达式1:表达式2;
		 * 条件表达式为true则结果为表达式1，否则结果为表达式2
		 * 
		 * 
		 * */
		//三元运算符应用之两个比较大小
		/*Scanner in=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("请输入a："+"\n");
		a=in.nextInt();
		System.out.println("请输入b："+"\n");
		b=in.nextInt();//nextint()中不需要加入要读入的变量
		System.out.println("最大值为:"+"\n");
		System.out.println(a>b ? a:b);
		*/
		//三元运算符应用之三个数比较大小
		Scanner in=new Scanner(System.in);
		int a=10,b=5,c=3;
		System.out.println("三者最大值为:"+"\n");
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));/*首先判断a,b大小这个条件表达式(a>b?).
		若a大则执行第一个表达式即(a>c?a:c)
		若b大则执行第二个表达式(b>c?b:c)*/
		
		
	}

}
