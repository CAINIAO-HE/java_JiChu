package day10;

public class AException
{
	class A{
		int i;
	}
public static void main(String args[]) {
	A test=null;
	String[] aa=new String[] {"a","b"};//ֻ���������ݣ��±�Ϊ0,1
//   try
//{
//	System.out.println(aa[2]);	//�ض����쳣������Խ��,�Ҵ˴��쳣�����󲻻�ִ�����������ָ���쳣
//	 System.out.println(test.i);//��ָ���쳣
//} catch (Exception e)//��Ϊ��֪���쳣�����������������쳣��ĸ���Exception��ʵ�����쳣����
//{
//	// TODO: handle exception
//	e.printStackTrace();//���������쳣�¼�����ʱִ�ж�ջ������
//	System.out.println(e.getMessage());//����й��쳣��Ϣ
//}
	try
	{
		System.out.println(aa[2]);
		 System.out.println(test.i);
	} catch (ArrayStoreException e1)
	{
		System.out.println(e1.getMessage());
		e1.printStackTrace();
		
		// TODO: handle exception
	}
	catch (NullPointerException e2) {
		System.out.println(e2.getMessage());
		e2.printStackTrace();
		
		// TODO: handle exception
	}
 
}
}
