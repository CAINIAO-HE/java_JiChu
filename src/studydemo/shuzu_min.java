package studydemo;

public class shuzu_min
{
public static void main(String args[]) {
	int[] ss=new int[] {2,10,5,1,8};
	int min=ss[0];
	for (int i = 0; i < ss.length; i++)
	{
		//int min=ss[0];���ܰ�������ʽд�ڴ˴�����ÿ��ѭ��һ��ʼmin�͵���ss[0]
		if (min>ss[i])
		{
			min=ss[i];
		}
		
	}
	System.out.println("minΪ:"+min);
}
}
