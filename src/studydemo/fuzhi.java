package studydemo;

import java.io.InputStream;
import java.util.Scanner;

public class fuzhi {
	public static void main(String args[]) {
		int a=0,b=0,sum=0;
		Scanner in=new Scanner(System.in);//创建一个scanner对象in
		System.out.println("请输入a的值:"+(a=in.nextInt())+"\n");
		//法二:a=in.nextInt();
		System.out.println("请输入b的值:"+(b=in.nextInt())+"\n");//+此处是java中格式控制符的用法
		//法二:b=in.nextInt();
		sum=a+b;
		System.out.println("总和sum为:"+sum);
		
	}
}
