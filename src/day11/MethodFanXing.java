package day11;

import day9.test;

public class MethodFanXing
{
public static void main(String args[]) {
	Cc cc=new Cc();
	cc.test("�ۻ�");//������ȷ���˷����ķ���
	Aa<String> aa=new Aa<String>();
	//��ΪAa�Ƕ����˷���������ʵ����ʱҪ��������
	aa.test4(2);//��̬�����Լ����巺��
	aa.test3(1);
	
}
}
class Cc{
	public <T> void test(T s) {
		T t=s;
		//�β������ɷ��͹涨
	}
	public <T> T test1(T s) {
		return s;
		/*����ֵ���ͺ��βζ��ɷ������
		 * ����������һ�����ͷ���
		 * ��������������������ʲô�����Ϳ����÷���ʱ�ĸ�ֵ��
		 * */
		
	}
	public <T> void test2(T...s) {/*
	�������ɱ�������͵ı����ķ���*/
		for(T t:s) {//for eachѭ������
			System.out.println(t);
		}
	}
	
}
class Aa<E>{
	public E e;//���Լ�����ķ��Ϳ��������������
	public static<E> void test3(E e) {
		
	}
	public static <T> void test4(T t) {
		/*
		 * 
		 * �ھ�̬�����У�����ʹ���ඨ��ķ��ͣ��������Ҫʹ�÷���
��ֻ��ʹ���Լ������*/
		System.out.println(t);
	}
	
}
