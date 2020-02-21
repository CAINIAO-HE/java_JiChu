package studydemo;

public class testcylinder
{
public static void main(String args[]) {
	circle op=new circle();
	cylinder ok=new cylinder();
	op.getRadius();
	//op.findArea();
	ok.findArea(op.radius);
	
	ok.getLength();
	System.out.println("体积为:");
	/*System.out.println(ok.findVolume());
	 * 错误计算体积的方法或者说思路错误的方法
	 * 简便方法应该是直接为这个方法赋形参而不是通过复杂传值去实现目的
	 * */
	/* ok.findVolume(op.findArea(), ok.length);
	* 未重写findArea()方法时计算体积的方法*/
	ok.findVolume(ok.findArea(op.radius), ok.length);
	System.out.println(ok instanceof cylinder);/*
	instanceof判断ok是不是类cylinder的对象
	*/
	/*总结：在继承里面稳妥的在方法间传递值还是用形参的方法总结赋好一些
	 * */
}
}
