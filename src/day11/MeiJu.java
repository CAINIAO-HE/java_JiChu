package day11;



public class MeiJu
{
	public static void main(
			String[] args
	) {
		
		season sea=season.SPRING;//season.SPRINGִ�о���������һ��season����
		sea.showinfo();
		season sea1=season.SPRING;
		//����season.SPRINGÿ��ִ�����ɵĶ�����ͬ�Ķ�����ö������ÿ��ö�ٶ��ǵ���ģʽ��
		System.out.println(sea.equals(sea1));
	}


  
}
 enum season{
	//����һ��ö���࣬����Ҫ�ùؼ���class
	SPRING("����","�ۻ���ʹ��������"),//ÿһ��Сö�ٶ�������һ�ι��췽��
	SUMMER("����","�ۻ�����������֣�ʹ������"),
	AUTUMN("����","�ۻ��������죬ʹ�ҵ���"),
	WINTER("����","�ۻ���Ϊʲô�����綬");
	 /*
	enum���ԡ� ����������"  ;"���������ÿ��ö�ٺ��涼�� �� ���� ���൱��
	ֻ�����˵�һ��ö��,�����Ķ����㣬��Ϊ����" ��"��β��*/
	
	 private final String name;//���Զ���private final����
	 private final String desv;
 
	 private season(String name,String desv) {
		 this.name=name;
		 this.desv=desv;
	 }
	public void showinfo() {
		System.out.println("����:"+this.name+"  "+"����:"+this.desv);
	}
}
