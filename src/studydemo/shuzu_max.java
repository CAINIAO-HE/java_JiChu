package studydemo;

public class shuzu_max
{/*

*断点调试步骤:
*1.在要断点的代码前面双击出现点后即可
*2.点击Run——>debug as——>java application
*3若是没有出现varibles项目框，则window——>show view——>varibles
*4.按F5（单步跳入）/F6（单步跳出）都可以一步一步调试下去
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
			max=arr[i];//存放目前最大值
		}
		
	}
	System.out.println("最大值:"+max);
	System.out.println("总和:"+sum);
}
}
