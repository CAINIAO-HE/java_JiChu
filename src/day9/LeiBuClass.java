package day9;

public class LeiBuClass
{
	/*����AҪӵ����B����C�ķ���������дִ�з���ʱ������ļ̳��ǲ��еģ���Ϊjava��֧�ֶ��ؼ̳У���һ����ͬʱ
	 * �̳������������ࡣ���ʱ��Ϳ����õ��ڲ����ˣ���A���ڲ�����������ֱ�̳�B���C��Ȼ������д����
	 * Ȼ��A�Ķ������Ե�����Щ��д�ķ���
	 * 
	 * */
	public static void main(String args[]) {
		A a=new A();/*ע��һ���ļ�����ͬʱ�����˶����Ļ��������ǲ��ܼ�public private��protected��
		����������ֻ������ĳ�Ա�Ż�����Щ���η�����Щ���е��ಢ�������ĳ�Ա
		��public class B{}д���е��������Ǵ���ģ�����LeiBuClass���������ȷ��
		*/
		a.test();
		
	}
	}
 class A{
	//�ڲ����������Ϊprivate��protected��final��static
	public void test() {
	new Innerb().showInfoB();/*
	new Innerb()���������������innerb���ڲ��࣬
	��A��������ʳ�Աһ��������Щ�ڲ��ࡣ�����ﵽ��Aͬʱ����ļ̳�����B����C����ʹ�����ǵķ���������
	*/
	new Innerc().showInfoC();
	}
private class Innerb extends B{//����Innerb�Լ̳���BȻ����дB�ķ�����������A����ļ̳�����B
	@Override
	//alt+/������д
	public void showInfoB() {
		System.out.println("������д��B�ķ���");
	}
}
private class Innerc extends C{
	@Override
	public void showInfoC(
	) {
		// TODO Auto-generated method stub
		//super.showInfoC();
		System.out.println("������д��C�ķ���");
	}
}
}
 class B{
	public void showInfoB() {
		
	}
}
 class C{
	public void showInfoC() {
		
	}
}


