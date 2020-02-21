package studydemo;

public class kebian_geshucanshu
{
	//方法1
public void printInfo(String... args) {
	/*我们要打印的东西来自于形参，假如输入不同的参数（如string,int,double）则
	 * 1.使用可变个数参数"..."
	 * 2、把数据写入string类型数组然后输出
	 * */
	for (int i = 0; i < args.length; i++)
	{
		System.out.println(args[i]);
		
	}
}
//方法二
public void printfinfoa(String[] args) {
	for (int i = 0; i < args.length; i++)
	{
		System.out.println(args[i]);
	}
}
}
