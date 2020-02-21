package day9;

public abstract class Employee
{
String name;
int id;
int salary;
public Employee(String name,int id,int salary) {
	this.name=name;
	this.id=id;
	this.salary=salary;
}
public abstract void work() ;
public abstract void showInfo();
}
