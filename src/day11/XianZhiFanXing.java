package day11;

import java.util.ArrayList;
import java.util.List;

public class XianZhiFanXing
{
	
public static void main(String args[]) {
	List<Bz> li1=new ArrayList<Bz>();
	List<D> li2=new ArrayList<D>();
	List<Ca> li3=new ArrayList<Ca>();
	List<E> li4=new ArrayList<E>();
	List<F> li5=new ArrayList<F>();
	test t1=new test();
	t1.test1(li1);//ʹ��test1����ʱ����B��list���ϵ��ββ��ᱨ��������ʹ��
	t1.test1(li2);//��B������D��Ϊ�������͵�list�����ܹ�����ӵ�test1�������β���
	//t1.test1(li3);���ֻᱨ����ΪC�಻��B�������
	t1.test2(li3);//���־��ǿ���ʹ����C��Ϊ�������͵�list���ϵķ���
	t1.test2(li4);//E����C����������Կ���ʹ�ü���li4
	t1.test3(li4);//ֻ������E���丸�����,li4����E��Ϊ�������ʹ�����list����
	t1.test3(li3);//C����E��ĸ���
	t1.test4(li5);//F��ʵ����comparable�ӿ�����test4�����ܹ�ʹ����F��Ϊ�������͵�list����
	
	
}
}
	class test{
		public void test1(List<?extends Bz>list) {//<? extends B>list���ϵĲ�������ΪB�༰������
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test2(List<? extends Ca>list) {//<?extends C>list���ϵĲ�������ΪC�༰������
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test3(List<?super E>list) {//<?super E>list���ϵĲ�������ΪE�༰�丸��
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	public void test4(List<? extends Comparable<String>>list) {//list���ϵĲ�������Ϊʵ����comparable�ӿڵ���
		//ֻ����ʵ����comparable�ӿڵ������
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
}
class Bz{
	int a;
	}

class Ca{
	int c;
}
class D extends Bz{
	
}
class E extends Ca{
	
}
class F implements Comparable<String>{

	@Override
	public int compareTo(
			String o
	) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}