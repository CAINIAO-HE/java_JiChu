package studydemo;

import java.util.Scanner;

public class fengzhuangtest
{
  public static void main(String args[]) {
	  fengzhuang op=new fengzhuang();
	  Scanner ss=new Scanner(System.in);
	  System.out.println("����������:");
	  int age;
	  age=ss.nextInt();
	  op.setage(age);
	  System.out.println("������:"+op.getage());
  }
}
