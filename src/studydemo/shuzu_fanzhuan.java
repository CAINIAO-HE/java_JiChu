package studydemo;

public class shuzu_fanzhuan
{//���鷴ת����һ�������ֵ���Ÿ���һ������
	public static void main(String args[]) {
		int[] arr=new int[] {2,5,7,3,1,5};//�������鲢�Ҹ�ֵ
		int[] temp=new int[arr.length];
		int k=0;
		for (int i = arr.length-1; i >=0; i--)
		{
			temp[k]=arr[i];
			k++;//����˼��һ��Ҫ��ס���ǲ���ѭ��ʱ��α���һ������
			
		}
		for (int j = 0; j < temp.length; j++)
		{
			System.out.println(temp[j]);
		}
	}

}
