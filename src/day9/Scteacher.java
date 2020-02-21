package day9;

public class Scteacher extends person implements cooking,sing
{//若是没有完全实现接口的全部方法则Scteacher应该声明为抽象类（这一点与抽象类的继承有相同的地方）
String course;
public Scteacher(String name,int age,String sex,String course) {
	super.name=name;
	super.age=age;
	super.sex=sex;//调用父类的sex,因为子类继承了父类的一切，所以不用另外声明可直接调用父类的用
	this.course=course;
}
@Override
//继承抽象类就必须实现父类里面的方法
void showInfo(
) {
	// TODO Auto-generated method stub
	//继承抽象类就要实现父类的方法
	System.out.println("姓名:"+super.name+","+"年龄:"+super.age
			+","+"性别:"+super.sex+","+"任课课程:"+this.course);
}
//public void fry() {
//	System.out.println(super.name+"老师会做饭");
//}
//public void singsing() {
//	System.out.println(super.name+"老师会唱歌");
//}
//类在implement接口时要实现接口里面的方法！！！！！！
@Override
public void singsing(
) {
	// TODO Auto-generated method stub
	System.out.println(super.name+"老师会唱歌!");
	
}
@Override
public void fry(
) {
	
	// TODO Auto-generated method stub
	System.out.println(super.name+"老师会做饭!");
	
}
public static void main(String args[]) {
	Scteacher he=new Scteacher("何兴龙", 22, "男", "java");
	//在赋值形参是string类型的要打双引号再在里面写
	he.showInfo();
	he.fry();
	he.singsing();
}
}
