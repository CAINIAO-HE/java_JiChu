package studydemo;

import java.util.Scanner;

public class fengzhuangtest
{
  public static void main(String args[]) {
	  fengzhuang op=new fengzhuang();
	  Scanner ss=new Scanner(System.in);
	  System.out.println("请输入年龄:");
	  int age;
	  age=ss.nextInt();
	  op.setage(age);
	  System.out.println("年龄是:"+op.getage());
  }
}
