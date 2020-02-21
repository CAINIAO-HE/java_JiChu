package studydemo;

public class ManKind
{
 int sex;
 int salary;
 void manorwoman(int sex) {
	 this.sex=sex;//给ManKind类的sex赋值为形参sex
	 if (this.sex==1)
	{
		System.out.println("男性");
	} else if (this.sex==0)
	{
		System.out.println("女性");
	}
	
 }
 void employeed(int salary) {
	 this.salary=salary;
	 if (this.salary==0)
	{
		System.out.println("No job!");
	} else
	{
       System.out.println("Job!");
	}
 }
 
}
