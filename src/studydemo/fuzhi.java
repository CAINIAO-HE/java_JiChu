package studydemo;

import java.io.InputStream;
import java.util.Scanner;

public class fuzhi {
	public static void main(String args[]) {
		int a=0,b=0,sum=0;
		Scanner in=new Scanner(System.in);//����һ��scanner����in
		System.out.println("������a��ֵ:"+(a=in.nextInt())+"\n");
		//����:a=in.nextInt();
		System.out.println("������b��ֵ:"+(b=in.nextInt())+"\n");//+�˴���java�и�ʽ���Ʒ����÷�
		//����:b=in.nextInt();
		sum=a+b;
		System.out.println("�ܺ�sumΪ:"+sum);
		
	}
}
