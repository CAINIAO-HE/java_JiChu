package day10;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class JiHeTreeSet2
{
public static void main(String args[]) {//��main������дȫʱ��������һ�����й�����
	
	person p1=new person("����", 23);
	person p2=new person("����", 20);
	person p3=new person("����", 16);
	person p4=new person("lucy", 29);
	Set<person>set=new TreeSet<person>(new person());
	/*<person>ʱ����,��ֻ��person����
	 * ��new person()��ԭ�򣬹��췽���ܴ�һ��comparator�Ƚ����Ĳ���
	 * �����εıȽ����Ķ���������
	 * */
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	//for each ����
	for(person p:set) {
		System.out.println(p.name+"  "+p.age);
	}
}
}
class person implements Comparator<person>{
/*��person����浽TreeSet�в��Ұ�����������
 * comparator�ǱȽ���*/
    int age;
    String name;
   public person(String name,int age) {
	   this.age=age;
	   this.name=name;
   }
   public person() {
	   
   }
   //ʵ�ֽӿڶ�Ҫ��д�ӿ�����ķ���
	@Override
	public int compare(
			person o1, person o2
	) {//��������������
		// TODO Auto-generated method stub
		//return 0;
		if (o1.age>o2.age)
		{
			return 1;
		} else if(o1.age<o2.age)
		{
    return -1;
		}
		else {
			return 0;
		}
	}
	
	
}