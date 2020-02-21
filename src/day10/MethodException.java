package day10;

public class MethodException
{
    
	
	public static void main(String args[]) {
		
		try
		{
			new B().test();/*
			at day10.MethodException.main(MethodException.java:11)
			上面这个是抛出的信息，告诉了异常在main方法，在第11行*/
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
			 * 抛出异常并且告诉异常在test方法，在第24行
			 * */
			B b=null;
			System.out.println(b.i);
		}
	}