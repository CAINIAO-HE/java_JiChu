package studydemo;

public class shuzu_max
{/*

*�ϵ���Բ���:
*1.��Ҫ�ϵ�Ĵ���ǰ��˫�����ֵ�󼴿�
*2.���Run����>debug as����>java application
*3����û�г���varibles��Ŀ����window����>show view����>varibles
*4.��F5���������룩/F6������������������һ��һ��������ȥ
*
*
*/
public static void main(String args[]) {
	int[] arr=new int[] {0,2,3,4,5};
	int max=arr[0];
	int sum=0;
	for (int i = 0; i < arr.length; i++)
	{
		sum+=arr[i];
		if (arr[i]>max)
		{
			max=arr[i];//���Ŀǰ���ֵ
		}
		
	}
	System.out.println("���ֵ:"+max);
	System.out.println("�ܺ�:"+sum);
}
}
