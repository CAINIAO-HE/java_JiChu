package studydemo;

public class This
{
	String name;
	int age;
   public This() {
	   System.out.println("��һ�����췽����");
   }
   public This(String name) {//�ڶ������ع��췽��
	   this.name=name;/*
	   �˴�this.name�е�name����This�е�����name
	   �ڶ���name�ǹ��췽�����β�.
	   this�ڷ�����ʹ�ã���ʾ��ǰ����,���Ե���������ԡ������͹�����
	   */
	   
   }
   public This(int age) {//���������ع��췽��
	   this();/*this()ָ������This������Ĺ��췽��public this(){},
	                         ��Ϊthis�������βζ�public this(){}��Ҳû���β�
	  �����������д�ڵ�һ��,��Ϊ�ڹ��췽������д�������췽���ǹ��췽������д�ڵ�һ��
	  */
	   this.age=age;
	   
   }
   public This(String name,int age) {//���ĸ����ع��췽��
	   this.name=name;
	   this.age=age;
   }
}
