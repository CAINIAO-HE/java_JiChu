package studydemo;

public class shuzu_he
{
	public static void main(String args[]) {
		int[][] arr=new int[][] {
			{1,2,3},
			{4,5,6},
			{7,8,9}};/*��̬���壬��ֵ���дΪ������ʽ
		ע�� int[][] arr=new int[3][3];�Ƕ�̬���壬�ھ�̬��main�������ǻᱨ���
		*/
			/*�ڶ��ַ�����ֱ�Ӹ��������Լ��ĳ��ȶ�ȡ����Ԫ��
			 * 
			 * int len=arr.length;//��ȡһά���鳤��
			 * int []arr1=arr[i];//��һά���������ֵ����arr1����
			 * ��Ϊ��ά����������Ϊÿһ��һά�����Ԫ��ֵΪһ��һά����
			 * int llen=arr1.length;//��ȡ��ά����ĳ���
			 * int sum=0;//�����ܺ�
			 * for(i=0;i<arr.length;i++){
			 *  for(j=0;j<arr1.length;j++){
			 *      sum+=arr[i][j];//һάά�ı������
			 *      }
			 *      }
			 *      system.out.println(sum);
			 * */
			/*�����ַ���
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
			System.out.println(arr[i][j]);//�������
		}
		
		}
		
		System.out.println(sum);
		
	}

}
