package day11;


public class FanXinglei
{
public static void main(String args[]) {
	String name="�ۻ�";
	Integer age=19;
	B bb=new B();//δָ�����ͣ�����ȷ���������ڵ��÷����ĸ�ֵ��
	B<Integer> ba=new B<Integer>();
	//�������һ��ʹ�÷�����ʵ������ָ������
	System.out.println(bb.test(age));
	C cc=new C();
	System.out.println(cc.test(name));
	
	
	
	
}
}
interface IB<T>{
	T test(T t) ;//���󷽷�����Ҫ������ֻ��Ҫ����
}
/*������ʱ��δ���뷺��ʵ��ʱ���뷺����Ķ�����ͬ����������
 * ���ʱ���轫���͵�����Ҳһ��ӵ�����
 * */
class B<T> implements IB<T>{

	@Override
	public T test(
			T t
	) {
		// TODO Auto-generated method stub
		return t;
	}
	/*ʵ�ֽӿ�ʱ��ָ���˷��͵ľ�����������
	 * �������ʵ�ֽӿ����з�����λ�ö�Ҫ�����滻ʵ�ʵľ���
	��������(��Ҫ�õ����͵ĵط����ᱻ�滻��ָ������������)*/
	}
class C implements IB<String>{

	@Override
	public String test(
			String t
	) {
		// TODO Auto-generated method stub
		return t;
	}
	
}

	
	
