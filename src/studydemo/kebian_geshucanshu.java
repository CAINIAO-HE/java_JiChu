package studydemo;

public class kebian_geshucanshu
{
	//����1
public void printInfo(String... args) {
	/*����Ҫ��ӡ�Ķ����������βΣ��������벻ͬ�Ĳ�������string,int,double����
	 * 1.ʹ�ÿɱ��������"..."
	 * 2��������д��string��������Ȼ�����
	 * */
	for (int i = 0; i < args.length; i++)
	{
		System.out.println(args[i]);
		
	}
}
//������
public void printfinfoa(String[] args) {
	for (int i = 0; i < args.length; i++)
	{
		System.out.println(args[i]);
	}
}
}
