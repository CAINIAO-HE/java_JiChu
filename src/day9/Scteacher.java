package day9;

public class Scteacher extends person implements cooking,sing
{//����û����ȫʵ�ֽӿڵ�ȫ��������ScteacherӦ������Ϊ�����ࣨ��һ���������ļ̳�����ͬ�ĵط���
String course;
public Scteacher(String name,int age,String sex,String course) {
	super.name=name;
	super.age=age;
	super.sex=sex;//���ø����sex,��Ϊ����̳��˸����һ�У����Բ�������������ֱ�ӵ��ø������
	this.course=course;
}
@Override
//�̳г�����ͱ���ʵ�ָ�������ķ���
void showInfo(
) {
	// TODO Auto-generated method stub
	//�̳г������Ҫʵ�ָ���ķ���
	System.out.println("����:"+super.name+","+"����:"+super.age
			+","+"�Ա�:"+super.sex+","+"�οογ�:"+this.course);
}
//public void fry() {
//	System.out.println(super.name+"��ʦ������");
//}
//public void singsing() {
//	System.out.println(super.name+"��ʦ�ᳪ��");
//}
//����implement�ӿ�ʱҪʵ�ֽӿ�����ķ���������������
@Override
public void singsing(
) {
	// TODO Auto-generated method stub
	System.out.println(super.name+"��ʦ�ᳪ��!");
	
}
@Override
public void fry(
) {
	
	// TODO Auto-generated method stub
	System.out.println(super.name+"��ʦ������!");
	
}
public static void main(String args[]) {
	Scteacher he=new Scteacher("������", 22, "��", "java");
	//�ڸ�ֵ�β���string���͵�Ҫ��˫������������д
	he.showInfo();
	he.fry();
	he.singsing();
}
}
