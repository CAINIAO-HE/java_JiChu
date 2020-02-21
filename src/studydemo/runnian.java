package studydemo;
import java.util.*;
public class runnian
{
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=0;
		System.out.println("请输入年份:");		
		a=in.nextInt();
		if ((a%4==0&&a%100!=0)||(a%400==0))//总结要理解闰年的含义及程序表达
		{/*
		闰年含义:年份能整除4但是不能整除100并且年能整除400
		*/
			System.out.println(a+"是闰年!");
		} else
		{
            System.out.println(a+"不是闰年!");
		}
	}

}
