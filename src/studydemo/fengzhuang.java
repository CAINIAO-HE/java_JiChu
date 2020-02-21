package studydemo;

import java.util.Scanner;

public  class fengzhuang
{
  
	   private int age;
	   public void setage(int agea) {
		   if (agea<0&&agea>130)
		{
			System.out.println("Êı¾İ´íÎó!");
			return;
		}else {
		   
		   age=agea;
		   }
	   }
	   public int getage() {
		   return age;
	   }
   }
  
