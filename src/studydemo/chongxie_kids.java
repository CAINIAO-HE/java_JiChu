package studydemo;

public class chongxie_kids extends chongxie_mankids
{
@Override//��д��־
void employeed(//�������д
		int salary
) {  /*
    ��alt +/�ͻ����������ʾѡ��Ҫ��д�ĸ��෽��Ȼ��ͻ��Զ���ȫ�������.
    ��������д��employeed����
*/
	// TODO Auto-generated method stub
	super.employeed(salary)//���ǵ��ø����employeed����
	/* * ��������super�����ǵ����˸���ķ�����
	 * ��eclipse�Զ����ɵģ�������ʱ�����и�����������
	 * �ɴ�������Ҫ���и������������ɽ���ע�͵�
	 * */;
	if (salary==1)
	{
		System.out.println("kids should study and no job");
	} else
	{
System.out.println("you must find a job ");
	}
}
public static void main(String args[]) {
	chongxie_kids kids=new chongxie_kids();
	kids.employeed(1);
}
}
