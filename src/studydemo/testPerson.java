package studydemo;

public class testPerson
{
public static void main(String args[]) {/*
string args[]是表示给主方法传递一个字符串数组
即保存运行main函数时输入的参数的
java本身不存在不带String args[] 的main方法
System.out.println("args[0]是:"+args[0]);
	System.out.println("args[1]是:"+args[1]);
	System.out.println("args[2]是:"+args[2]);

*/
	Person person=new Person();/*
	同一个包下面的类是可以在另一个同一个包下的类中被实例化的
	实例方式如上
	假如一个类中声明了另一个类,则实例化方式为:
	如public class person{
	      *******
	      *******
	   public class testperson{
	   *******
	   *******
	   
	   }
	   public static void main(){
	   testperson op=new person().new testperson();//先找到父类在到子类
	   
	   }
	   
	  }
	*/
	//person.age=20;
	//person.sleep="睡觉";
	//System.out.println("年龄是:"+person.age);
	/*System.out.println(person.sleeping());
	 * 此处犯了两个个错误就是
	 * 1.sleep()中已经有了println语句
	 * 2.假如像上面那样写了会报错boolean不能与void匹配
	 * */
	
	//person.sleeping();
	person.name="小明";
	person.age=20;
	person.sex="男";
	person.study();
	person.addage();
	person.showage();
	System.out.println(person.addage());;
	}
}
