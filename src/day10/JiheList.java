package day10;

import java.util.ArrayList;
import java.util.List;

public class JiheList
{
public static void main(String args[]) {
	List<String> list=new ArrayList<String>();
	/*�½�һ��ֻ�ܴ�string����Ԫ�ص�list����*/
	list.add("b");//��һ���������±�Ϊ0
	list.add("d");//�����±�1
	list.add("c");//�����±�2
	list.add("a");//�����±�3
	list.add("a");//�������ظ�Ԫ��
	System.out.println(list);
	System.out.println(list.get(2));
	//ͨ������������ָ��λ�õļ���Ԫ��
	list.add(4, "f");//��ָ�������±�λ�ò�������
	System.out.println(list);
	System.out.println("��һ���������������һ������");
	//��һ���������������һ������
	List<String> aa=new ArrayList<String>();
	aa.add("123");
	aa.add("456");
	aa.add("789");
  list.addAll(2, aa);//�������±�λ��2���뼯��aa
  System.out.println(list);
  System.out.println(list.indexOf("d"));
  //��ȡָ��Ԫ���ڼ����е�һ�γ��ֵ������±�
  System.out.println(list.lastIndexOf("a"));
  /*
   * ��ȡָ��Ԫ���ڼ��������һ�γ��ֵ������±꣬
   * �±궼�Ǵ�0��ʼ��
   * */
  list.remove(2);//��ָ���±��Ƴ�Ԫ��
  System.out.println(list);
  list.set(1, "ff");//��ָ���±��޸�Ԫ��
  System.out.println(list);
  List<String> sublist=list.subList(2, 4);
  /*���������±���ʼλ������ȡһ��Ԫ���γ��µļ���
   * sublist���ǽ���ѡ����Ԫ�ص�
   * ��ȡʱ������ʼ����������������ʱ��
   * ��2=< x <4
   * */
  System.out.println(sublist);
}
}
