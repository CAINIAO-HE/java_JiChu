package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JiheHashSet
{
public static void main(String args[]) {
	Set set=new HashSet();//�½�һ��hashset����
	set.add(1);/*���Ԫ��1��
	
	���ܼ���ֻ�ܴ���󣬵��������ǰ�int�͵�����ת��Ϊ���������Կ��Դ棬�����������������*/
	set.add(2);
	set.add(3);
	set.add("a");
	set.add("b");
	set.add("b");//�ᷢ��hashset�����в�û������b����Ϊ�����ظ����ظ��Ĵ治��ȥ
	set.add(null);//hashset�����null�����ҷ��ڵ�һ��
	System.out.println(set);//�������
	set.remove(2);//�Ƴ�Ԫ��2
	System.out.println(set);
	System.out.println(set.contains(1));//�ж�set����������û��Ԫ��1������Booleanֵ
	//set.clear();//��ռ���
	System.out.println(set);
	//�õ�������������
	  System.out.println("�õ�������������");
	Iterator it=set.iterator();//�½�һ��������
	while (it.hasNext())//��������������һ��ʱ
	{
		System.out.println(it.next());//�����
		
	}
     System.out.println("for each��������");
//for each��������,�Ƽ�ʹ��
	for(Object obj :set) {//�½�һ��Obj����Ȼ����������������Ԫ�ظ���obj
		System.out.println(obj);//���Ԫ��
	}
	System.out.println("����Ԫ�ظ���:"+set.size());//��ȡ����Ԫ�ظ���
	System.out.println("Ҫ�뼯��ֻ�ܴ���ͬԪ�ؾ��÷���");
	//Ҫ�뼯��ֻ�ܴ���ͬԪ�ؾ��÷���
	
	Set<String>opSet=new HashSet<String>();//ֻ��string����,���ܴ�string������Ķ���
	Set<Object> aa=new HashSet<Object>();/*���Դ���������
	����һ�ַ������ǲ���������������д�κζ����������ʼ��������set����*/
	
}
}
