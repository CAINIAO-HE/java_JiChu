package day10;

public class MethodException
{
    
	
	public static void main(String args[]) {
		
		try
		{
			new B().test();/*
			at day10.MethodException.main(MethodException.java:11)
			����������׳�����Ϣ���������쳣��main�������ڵ�11��*/
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
class B{
		int i;
		public void test() throws Exception{
			/*at day10.B.test(MethodException.java:24)
			 * �׳��쳣���Ҹ����쳣��test�������ڵ�24��
			 * */
			B b=null;
			System.out.println(b.i);
		}
	}