package day11;

import javax.crypto.SecretKey;

/*������*/

public class Fanxing
{
public static void main(String args[]) {
	A<String> aa=new A<String>();
	/*һֱ���⣬������A�Ķ���ʱ��ָ����
	 * ����Ϊstring������A����������TҲ�ͱ�ȷ��Ϊstring
	 * ����*/
	aa.setKey("����");
	String s=aa.getKey();/*
	��һ��string���͵ı�������getkey()�ķ���ֵ*/
	System.out.println(s);
	System.out.println("integer����ʵ��");
	A<Integer> ss=new A<Integer>();
	//��ʱA��key���������;�������integer
	ss.setKey(19);
	Integer i=ss.getKey();
	System.out.print(i);
	//������������и����Object
	System.out.println("������������и����Object");
	A qq=new A();
	qq.setKey(new Object());
	//���Կ�����ʱ�������ͳ�Ϊ��Object
	Object obj=qq.getKey();
	/*����ͬ�����࣬������new����ʱ����ָ����ͬ��
	 * �������ͣ���Щ����ʱ���ܻ��ำֵ��*/
	//ss=aa;�ᱨ����Ϊ�������Ͳ���ͬ
	
}
}/*
�˴���T����A�ķ��ͣ�
���Ҳ�֪����ʵ������������
*/
class A<T>{
	private T key;
public void setKey(T key) {
	this.key=key;
}	
public T getKey() {
	return(this.key);
}
	
}