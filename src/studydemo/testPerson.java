package studydemo;

public class testPerson
{
public static void main(String args[]) {/*
string args[]�Ǳ�ʾ������������һ���ַ�������
����������main����ʱ����Ĳ�����
java�������ڲ���String args[] ��main����
System.out.println("args[0]��:"+args[0]);
	System.out.println("args[1]��:"+args[1]);
	System.out.println("args[2]��:"+args[2]);

*/
	Person person=new Person();/*
	ͬһ������������ǿ�������һ��ͬһ�����µ����б�ʵ������
	ʵ����ʽ����
	����һ��������������һ����,��ʵ������ʽΪ:
	��public class person{
	      *******
	      *******
	   public class testperson{
	   *******
	   *******
	   
	   }
	   public static void main(){
	   testperson op=new person().new testperson();//���ҵ������ڵ�����
	   
	   }
	   
	  }
	*/
	//person.age=20;
	//person.sleep="˯��";
	//System.out.println("������:"+person.age);
	/*System.out.println(person.sleeping());
	 * �˴������������������
	 * 1.sleep()���Ѿ�����println���
	 * 2.��������������д�˻ᱨ��boolean������voidƥ��
	 * */
	
	//person.sleeping();
	person.name="С��";
	person.age=20;
	person.sex="��";
	person.study();
	person.addage();
	person.showage();
	System.out.println(person.addage());;
	}
}
