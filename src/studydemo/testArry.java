package studydemo;

public class testArry
{
	public static void main(String args[]) {
		int[] arr1=new int[] {2,3,5,7,11,13,17,19};
		int[] arr2=new int[arr1.length];
	    
		for ( int i= 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		System.out.println("arr1�Ѿ�������!");
		int j=0;
		for (int i = 0; i < arr1.length; i++)
		{
			
		arr2[j]=arr1[i];
		j++;
		
		}
		for ( j= 0; j < arr1.length; j++)//j�Ѿ�ȫ�ֶ�����˲����ٶ���
		{
			System.out.println(arr2[j]);
		}
		System.out.println("arr2������!");
		for (int i = 0; i < arr2.length; i++)
		{
			if (i%2==0)
			{
				arr2[i]=i;
			}
			System.out.println(arr2[i]);
			
		}
		
	}
}
		
	
		
		

   


