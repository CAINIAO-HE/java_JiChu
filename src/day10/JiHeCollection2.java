package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JiHeCollection2
{
public static void main(String args[]) {
	List<String> li=new ArrayList<String>();
	//�½�һ������Ϊstring��list����
	li.add("a");
	li.add("b");
	li.add("d");
	li.add("c");//����Щ����Ԫ�ط��뼯��
	/*collections���������ֱ�ӵ����Լ��ľ�̬����
	 * ����Ҫnewһ�����������á���������ʳ�Ϊ������*/
	System.out.println("���ù�����ķ�������תԪ��˳��");
	Collections.reverse(li);//���ù�����ķ�������תԪ��˳��
    System.out.println(li);
    System.out.println("�Լ���Ԫ���������");
    Collections.shuffle(li);//�Լ���Ԫ���������
    System.out.println(li);
    System.out.println("��Ԫ�ص���Ȼ˳�������������");
    Collections.sort(li);//��Ԫ�ص���Ȼ˳�������������
    System.out.println(li);
    System.out.println("�Ѽ����е�1��Ԫ�غ�3��Ԫ�ؽ��н���");
    Collections.swap(li, 1, 3);
    //�Ѽ����е�i��Ԫ�غ�j��Ԫ�ؽ��н���
    System.out.println(li);
    System.out.println("����Ȼ˳�򷵻����Ԫ��");
    //����Ȼ˳�򷵻����Ԫ��
    System.out.println(Collections.max(li));
    System.out.println("����Ȼ˳�򷵻���СԪ��");
    System.out.println(Collections.min(li));
    
    
}
}
