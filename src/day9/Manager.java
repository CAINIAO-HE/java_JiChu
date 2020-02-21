package day9;

public class Manager extends Employee
{
	int bonus;
public Manager(
			String name, int id, int salary
	,int bonus)
	{
	super(name, id, salary);
	
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
@Override
public void work(
) {
	System.out.println("这是经理");
	this.showInfo();
	// TODO Auto-generated method stub
	
}
@Override
public void showInfo(
) {
	// TODO Auto-generated method stub
	System.out.println("姓名:"+super.name
			+","+"工号:"+super.id+","
			+"薪水:"+super.salary+","+"奖金:"+this.bonus);
}


}
