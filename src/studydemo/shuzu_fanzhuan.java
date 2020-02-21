package studydemo;

public class shuzu_fanzhuan
{//数组反转，把一个数组的值倒着给另一个数组
	public static void main(String args[]) {
		int[] arr=new int[] {2,5,7,3,1,5};//声明数组并且赋值
		int[] temp=new int[arr.length];
		int k=0;
		for (int i = arr.length-1; i >=0; i--)
		{
			temp[k]=arr[i];
			k++;//这种思想一定要记住就是不用循环时如何遍历一个数组
			
		}
		for (int j = 0; j < temp.length; j++)
		{
			System.out.println(temp[j]);
		}
	}

}
