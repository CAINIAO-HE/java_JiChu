package studydemo;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class testclass
{

 public class person{
	String person_name;//��Ա����,��Ĭ�ϳ�ʼ��ֵ���Բ��ó�ʼ��
	int person_age;
	boolean ismarry;
	void sleep(int i) {
		if(i==1) {
			System.out.println("�Ѿ�˯���ˣ�");
		}else {
			System.out.println("û��˯!");
		}
	}
	void eating(int j) {
		if (j==1)
		{
			System.out.println("�Ѿ��Թ���!");
		} else
		{
       System.out.println("������û�гԹ�!");
		}
	}
}

       class animal{
    	   String animal_name;
    	   int animal_age;
    	   String hobby(String hobby_name) {//name_hobby�Ǿֲ�����,Ҫ��ʽ��ʼ��
    		   return hobby_name;/*�������˷���ֵ���ͺ���Ҫ��һ������ֵ��
    		   println()����������Ƿ���Ҫ��������
    		   
    		   */
    	   }
    	   void food(String name_food) {
    		   System.out.println("����");
    	   }
    	   int get_animal_birthdy(int animal_birthday) {
    		   return animal_birthday;
    	   }
    	   
       }
       
       public static void main(String args[]) {
    	person sd=new testclass().new person();/*
    	person�Ƕ�̬�࣬main�Ǿ�̬����
    	Ҫ���ھ�̬�����е��ö�̬��ʵ������������ѭ����̬�� ������=new �ⲿ�ࣨ��.new ��̬�ࣨ����
    	��һ�ַ����ǰ�������Ϊ��̬���������ھ�̬������ֱ�ӵ���������ʵ��
    	*/
    	animal huahua=new testclass().new animal();//ʵ��һ�������������Ϊ����
    	Scanner in=new Scanner(System.in);
      // System.out.println("�Է�����?");
       //sd.eating(1);
      System.out.println("������������ʲô:");
       huahua.animal_name=in.next();
       System.out.println("�����İ�����ʲô:");
       String hobby_name;
       hobby_name=in.next();
       System.out.println("�����İ�����"+huahua.hobby(hobby_name));
       System.out.println("����������"+huahua.animal_name);
       
       }
}
