package studydemo;

import java.util.Scanner;


public class sanwei_yunsuan {
	public static void main(String args[]) {
		/*��Ԫ���㹫ʽ:(�������ʽ)?���ʽ1:���ʽ2;
		 * �������ʽΪtrue����Ϊ���ʽ1��������Ϊ���ʽ2
		 * 
		 * 
		 * */
		//��Ԫ�����Ӧ��֮�����Ƚϴ�С
		/*Scanner in=new Scanner(System.in);
		int a=0,b=0;
		System.out.println("������a��"+"\n");
		a=in.nextInt();
		System.out.println("������b��"+"\n");
		b=in.nextInt();//nextint()�в���Ҫ����Ҫ����ı���
		System.out.println("���ֵΪ:"+"\n");
		System.out.println(a>b ? a:b);
		*/
		//��Ԫ�����Ӧ��֮�������Ƚϴ�С
		Scanner in=new Scanner(System.in);
		int a=10,b=5,c=3;
		System.out.println("�������ֵΪ:"+"\n");
		System.out.println(a>b?(a>c?a:c):(b>c?b:c));/*�����ж�a,b��С����������ʽ(a>b?).
		��a����ִ�е�һ�����ʽ��(a>c?a:c)
		��b����ִ�еڶ������ʽ(b>c?b:c)*/
		
		
	}

}
