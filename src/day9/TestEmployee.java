package day9;

public class TestEmployee
{
public static void main(String args[]) {
	Manager zhang=new Manager("何兴龙",201614519 , 5000,3000);
   CommonEmployee he=new CommonEmployee("朱海军",201614130, 4000);
   zhang.work();
   he.work();
}
}
