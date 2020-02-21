package studydemo;

public class This
{
	String name;
	int age;
   public This() {
	   System.out.println("第一个构造方法·");
   }
   public This(String name) {//第二个重载构造方法
	   this.name=name;/*
	   此处this.name中的name是类This中的属性name
	   第二个name是构造方法的形参.
	   this在方法中使用，表示当前对象,可以调用类的属性、方法和构造器
	   */
	   
   }
   public This(int age) {//第三个重载构造方法
	   this();/*this()指调用了This类里面的构造方法public this(){},
	                         因为this里面无形参而public this(){}中也没有形参
	  这个方法必须写在第一行,因为在构造方法里面写其他构造方法是构造方法必须写在第一行
	  */
	   this.age=age;
	   
   }
   public This(String name,int age) {//第四个重载构造方法
	   this.name=name;
	   this.age=age;
   }
}
