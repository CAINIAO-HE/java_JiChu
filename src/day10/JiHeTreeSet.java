package day10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class JiHeTreeSet
{
	public static void main(String args[]) {
		
		Set<Integer> set1=new TreeSet<Integer>();
		set1.add(2);
		set1.add(5);
		set1.add(1);
		set1.add(8);
		System.out.println(set1);//TreeSet����Ȼ�����
		set1.remove(5);//�Ƴ�5
		set1.contains(1);//�жϼ��ϴ治����1
		//set1.clear();�������
		System.out.println("ʹ�õ�������������");
		//ʹ�õ�������������
		Iterator<Integer> it=set1.iterator();//�½�һ��������
		while (it.hasNext())//��������������һ��ʱ
		{
			System.out.println(it.next());//�������Ԫ��
			
		}
		System.out.println("for each�������ϣ��Ƽ�ʹ��");
		//for each�������ϣ��Ƽ�ʹ��
		for(Integer i:set1) {
			System.out.println(i);
		}
	}
}
