package studydemo;

import java.util.Scanner;

public class circl_test
{
public static void main(String args[]) {
	circl cira=new circl();
	Scanner in=new Scanner(System.in);
	System.out.println("������԰�뾶:");
	cira.R=in.nextDouble();
	System.out.println("Բ���Ϊ:");
	System.out.println(cira.circle());
	
}
}
