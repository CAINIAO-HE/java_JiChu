package studydemo;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class testclass
{

 public class person{
	String person_name;//成员变量,有默认初始化值可以不用初始化
	int person_age;
	boolean ismarry;
	void sleep(int i) {
		if(i==1) {
			System.out.println("已经睡过了！");
		}else {
			System.out.println("没有睡!");
		}
	}
	void eating(int j) {
		if (j==1)
		{
			System.out.println("已经吃过了!");
		} else
		{
       System.out.println("不！还没有吃过!");
		}
	}
}

       class animal{
    	   String animal_name;
    	   int animal_age;
    	   String hobby(String hobby_name) {//name_hobby是局部变量,要显式初始化
    		   return hobby_name;/*在声明了返回值类型后函数要有一个返回值，
    		   println()是输出并不是返回要加以区分
    		   
    		   */
    	   }
    	   void food(String name_food) {
    		   System.out.println("狗粮");
    	   }
    	   int get_animal_birthdy(int animal_birthday) {
    		   return animal_birthday;
    	   }
    	   
       }
       
       public static void main(String args[]) {
    	person sd=new testclass().new person();/*
    	person是动态类，main是静态方法
    	要想在静态方法中调用动态类实例化对象则遵循：动态类 对象名=new 外部类（）.new 动态类（）；
    	另一种方法是把类声明为静态类这样可在静态方法中直接调用类声明实例
    	*/
    	animal huahua=new testclass().new animal();//实例一个动物对象名字为花花
    	Scanner in=new Scanner(System.in);
      // System.out.println("吃饭了吗?");
       //sd.eating(1);
      System.out.println("狗狗的名字是什么:");
       huahua.animal_name=in.next();
       System.out.println("狗狗的爱好是什么:");
       String hobby_name;
       hobby_name=in.next();
       System.out.println("狗狗的爱好是"+huahua.hobby(hobby_name));
       System.out.println("狗狗名字是"+huahua.animal_name);
       
       }
}
