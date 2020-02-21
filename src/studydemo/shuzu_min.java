package studydemo;

public class shuzu_min
{
public static void main(String args[]) {
	int[] ss=new int[] {2,10,5,1,8};
	int min=ss[0];
	for (int i = 0; i < ss.length; i++)
	{
		//int min=ss[0];不能把这个表达式写在此处否则每次循环一开始min就等于ss[0]
		if (min>ss[i])
		{
			min=ss[i];
		}
		
	}
	System.out.println("min为:"+min);
}
}
