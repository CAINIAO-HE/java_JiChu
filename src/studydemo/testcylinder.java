package studydemo;

public class testcylinder
{
public static void main(String args[]) {
	circle op=new circle();
	cylinder ok=new cylinder();
	op.getRadius();
	//op.findArea();
	ok.findArea(op.radius);
	
	ok.getLength();
	System.out.println("���Ϊ:");
	/*System.out.println(ok.findVolume());
	 * �����������ķ�������˵˼·����ķ���
	 * ��㷽��Ӧ����ֱ��Ϊ����������βζ�����ͨ�����Ӵ�ֵȥʵ��Ŀ��
	 * */
	/* ok.findVolume(op.findArea(), ok.length);
	* δ��дfindArea()����ʱ��������ķ���*/
	ok.findVolume(ok.findArea(op.radius), ok.length);
	System.out.println(ok instanceof cylinder);/*
	instanceof�ж�ok�ǲ�����cylinder�Ķ���
	*/
	/*�ܽ᣺�ڼ̳��������׵��ڷ����䴫��ֵ�������βεķ����ܽḳ��һЩ
	 * */
}
}
