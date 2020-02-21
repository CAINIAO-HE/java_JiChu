package day10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//���⣺�ù�����collections�е�sort(List��Comparator)������ָ���� Comparator ������˳��� List ����Ԫ�ؽ�������

public class JiHeCollection
{
public static void main(String args[]) {
	
	List<student> list=new ArrayList<student>();//���Ĳ�
	//�½�һ������Ϊstudent��list����
	student stu1=new student(11, "����");//���岿�½�����ʵ��
	student stu2=new student(23, "����");
	student stu3=new student(13, "lucy");
	student stu4=new student(35, "����");
	list.add(stu1);//���߲��Ѷ�����뼯��list
	list.add(stu2);
	list.add(stu3);
	list.add(stu4);
	//for eachѭ��,���������������,�鿴list����Ȼ����
	for(student stu:list) {//��list�����Ԫ�ظ�stu
		System.out.println("age:"+stu.age
				+" "+"name:"+stu.name);
	}
	
	System.out.println("��comparator�����������");
      Collections.sort(list, new student());
      for(student stu:list) {//��list�����Ԫ�ظ�stu
  		System.out.println("age:"+stu.age
  				+" "+"name:"+stu.name);
  		//��comparator������˳�򷵻ؼ����е����ֵ
  		student s=Collections.max(list, new student());
  		System.out.println("�����:"+"����:"+s.age+" "+"����:"
  				+s.name);
  		//��comparator������˳�򷵻ؼ����е���Сֵ
  		student ss=Collections.min(list, new student());
  		System.out.println("��С��:"+"����:"+ss.age+" "+"����:"+ss.name);
  		//����ָ��Ԫ���ڼ����г��ֵĴ���
  		System.out.println(Collections.frequency(list, stu1));
  		//����ֵ�滻��ֻ
  		student stu5=new student(22, "�ۻ�");
  		Collections.replaceAll(list, stu2, stu5);//stu2�Ǿ�ֵ��syu5����ֵ
  		for(student ab:list) {
  			System.out.println("����:"+ab.name+" "
  					+"����:"+ab.age);
  		}
  	}
      }
}
class student implements Comparator<student>//��һ���½�student�ಢ��ʵ�ֽӿ�comparator
{
//�ȽϷ���
	int age;
	String name;
	public student() {
		
	}
	public student(int age,String name) {//�ڶ������������췽��
		this.age=age;
		this.name=name;
	}
	@Override
	public int compare(
			student o1, student o2
	) {//��������дcompare����,������ȽϷ���ֵ
		// TODO Auto-generated method stub
		if (o1.age>o2.age)
		{
			return 1;
		} else if (o1.age<o2.age)
		{
			return -1;
		}else
		{
          return 0;
		}
		
	}
	
}