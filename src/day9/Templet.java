package day9;



public abstract class Templet
{
	public abstract void code();//Ҫ��������󷽷�����д�ڵ��õ�ǰ����ϵͳ�ȱ��룬���ڵ��ú��������
	
public final void getTime() {
	long start=System.currentTimeMillis();
	code();
	long end=System.currentTimeMillis();
	System.out.println("ִ��ʱ��:"+(end-start));
}

}
