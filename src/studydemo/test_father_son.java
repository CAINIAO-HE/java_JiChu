package studydemo;

public class test_father_son
{
	public void test(father e) {/*
	ע������ǿ������ת�������ڸ���������֮�䣬��������֮��û�й�ϵ���ǲ���ǿ��ת����
	*
	*/
		if (e instanceof son)//�˴��ж϶���e�ǲ�����son�Ķ����ǵĻ���Ϊtrue
		{
			son s=(son) e;/*
			  ���ж�eΪson�Ķ���ʱ�������β����Ը��������ģ�Ҫ��ʹ������ķ���
			  ���Ǳ���Ѹ������ǿתΪ���������Ϊ������Լ̳и���ķ���
			  ���Ǹ��಻������������ķ������ԣ��Ѹ������ǿתΪ���������
			  ����ʹ�������Լ��ķ���������
			*
			*/
		     s.Smethod();
		} else
		{
   e.Fmethod();
		}
	}
public static void main(String args[]) {
	father f=new father();
	son ss=new son();
	test_father_son test=new test_father_son();
	test.test(f);//������Ǹ�������ִ��else����
	test.test(ss);//���������������ִ�е�һ���ֵĴ���
	test.test(new son());/*
	������ʽ��������ķ�������ֻ�õ�һ�ζ���ʱ�Ϳ�������ʹ��
	Ч���Ͷ�����һ�µ�
	*/
}
}
