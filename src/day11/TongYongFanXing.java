package day11;

import java.util.ArrayList;
import java.util.List;

public class TongYongFanXing
{
public static void main(String args[]) {
	//����ͨ���
	List<String> li=new ArrayList<String>();
	/*
	 * �½���һ��string���͵ļ���
	 * ��ʱ�������˼��ϵ���������
	 * 
	 * 
	 * */
	li.add("����");
	li.add("�ۻ�");
	li.add("����");
	li.add("С��");
	Qq qq=new Qq();
	qq.test1(li);
	//������integer���͵ļ���
	List<Integer> in=new ArrayList<Integer>();
	in.add(10);
	in.add(12);
	in.add(14);
	in.add(1);
	qq.test1(in);
	
}
}

class Qq{
	public void test1(List<?> list) {
		/*test������Ҫһ��list���ϲ���
		 * ���ǲ�֪��Ԫ���������Ծ���?����ʾ
		 * ����ʲô���;�תΪ�Ǹ�����*/
		for(Object obj:list) {
			System.out.println(obj);
		}
		
	}
}