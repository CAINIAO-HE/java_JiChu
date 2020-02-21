package studydemo;

public class shuzu_he
{
	public static void main(String args[]) {
		int[][] arr=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}};/*静态定义，赋值最好写为矩阵形式
		注意 int[][] arr=new int[3][3];是动态定义，在静态类main方法中是会报错的
		*/
			/*第二种方法，直接根据数组自己的长度读取数组元素
			 * 
			 * int len=arr.length;//获取一维数组长度
			 * int []arr1=arr[i];//把一维数组里面的值赋给arr1数组
			 * 因为二维数组可以理解为每一个一维数组的元素值为一个一维数组
			 * int llen=arr1.length;//获取二维数组的长度
			 * int sum=0;//定义总和
			 * for(i=0;i<arr.length;i++){
			 *  for(j=0;j<arr1.length;j++){
			 *      sum+=arr[i][j];//一维维的遍历相加
			 *      }
			 *      }
			 *      system.out.println(sum);
			 * */
			/*第三种方法
			 * for (int i = 0; i < arr.length; i++)
			{
				for (int j = 0; j < arr[i].length; j++)
				{
					
				}
				
			}*/
			int sum=0;
		for (int  i= 0;  i< 3; i++)
		{
		for (int j = 0; j < 3; j++)
		{
			sum+=arr[i][j];
			System.out.println(arr[i][j]);//按序输出
		}
		
		}
		
		System.out.println(sum);
		
	}

}
