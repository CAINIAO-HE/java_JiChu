package studydemo;

import java.util.Scanner;

public class circl_test
{
public static void main(String args[]) {
	circl cira=new circl();
	Scanner in=new Scanner(System.in);
	System.out.println("请输入园半径:");
	cira.R=in.nextDouble();
	System.out.println("圆面积为:");
	System.out.println(cira.circle());
	
}
}
