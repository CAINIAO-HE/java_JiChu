package studydemo;
import java.util.*;
public class runnian
{
	
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int a=0;
		System.out.println("���������:");		
		a=in.nextInt();
		if ((a%4==0&&a%100!=0)||(a%400==0))//�ܽ�Ҫ�������ĺ��弰������
		{/*
		���꺬��:���������4���ǲ�������100������������400
		*/
			System.out.println(a+"������!");
		} else
		{
            System.out.println(a+"��������!");
		}
	}

}
