package studydemo;

public class ManKind
{
 int sex;
 int salary;
 void manorwoman(int sex) {
	 this.sex=sex;//��ManKind���sex��ֵΪ�β�sex
	 if (this.sex==1)
	{
		System.out.println("����");
	} else if (this.sex==0)
	{
		System.out.println("Ů��");
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
