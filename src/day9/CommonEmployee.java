package day9;

public class CommonEmployee extends Employee
{

	

	public CommonEmployee(
			String name, int id, int salary
	)
	{
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work(
	) {
		System.out.println("这是一个普通员工");
		// TODO Auto-generated method stub
		this.showInfo();
	}

	@Override
	public void showInfo(
	) {
		// TODO Auto-generated method stub
		System.out.println("姓名:"+super.name+","
				+"工号:"+super.id+","+"薪水"+super.salary);
	}

}
