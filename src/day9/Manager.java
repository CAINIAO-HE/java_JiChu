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
	System.out.println("���Ǿ���");
	this.showInfo();
	// TODO Auto-generated method stub
	
}
@Override
public void showInfo(
) {
	// TODO Auto-generated method stub
	System.out.println("����:"+super.name
			+","+"����:"+super.id+","
			+"нˮ:"+super.salary+","+"����:"+this.bonus);
}


}
