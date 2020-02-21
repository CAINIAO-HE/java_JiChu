package studydemo;

import java.util.Scanner;

public class solution
{ 
	int [] nums=new int[] {2,3,4,5,6,7};
	int[] all=new int[nums.length];
public  int[] twosum(int[] nums,int target) {
	
	int sum;
	for (int  i= 0;  i< nums.length; i++)
	{
		for (int j = i+1; j < nums.length; j++)
		{
			//sum=nums[i]+nums[j];
		
		if (target==nums[i]+nums[j])/*
		
		*用双层循环是因为单层循环一次只能遍历一个位置后一个没有遍历到
		*/
		{   
			all[0]=i;
			all[1]=j;
			}
		}
		
		
	}
	return all;
}
public static void main(String args[]) {
	solution ss=new solution();
	Scanner op=new Scanner(System.in);
    int [] nums=new int[] {2,3,4,5,6,7};
    int target;
    System.out.println("请输入target的值:");
    target=op.nextInt();
    ss.twosum(nums, target);
  System.out.println("符合的数的位置为：");
    for (int i = 0; i <nums.length-4; i++)
	{
		System.out.println(ss.all[i]);
	}
    
}
}
