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
		System.out.println("����һ����ͨԱ��");
		// TODO Auto-generated method stub
		this.showInfo();
	}

	@Override
	public void showInfo(
	) {
		// TODO Auto-generated method stub
		System.out.println("����:"+super.name+","
				+"����:"+super.id+","+"нˮ"+super.salary);
	}

}
