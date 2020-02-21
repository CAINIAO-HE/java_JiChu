package studydemo;

public class order
{
int orderId;
String orderNmae;
public order(int orderid,String ordername) {//构造方法
	this.orderId=orderid;
	this.orderNmae=ordername;
}
public int getOrderId(/*右键点source-->Generate getter and setter
把要建立get和set方法的变量打钩然后指行*/
) {
	return orderId;
}
public void setOrderId(
		int orderId
) {
	this.orderId = orderId;
}
public String getOrderNmae(
) {
	return orderNmae;
}
public void setOrderNmae(
		String orderNmae
) {
	this.orderNmae = orderNmae;
}
@Override
	public boolean equals(
			Object obj
	) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
	boolean value=false;
	if (obj instanceof order)//判断形参是不是order类型
	{
		order aa=(order) obj;/*把给的obj强转为子类类型对象，
		尽管形参是order对象但是是父类型所以要强转*/
		if (this.orderId==aa.orderId&&this.orderNmae.equals(aa.orderNmae))
		{//因为orderid是int类型所以用==，ordername是string类型所以用equals
			value=true;
		}
		else {
			value=false;
		}
	}
	return value;
}
public static void main(String args[]) {
	order qq=new order(123, "abs");
	order ww=new order(123, "abc");
	order ee=new order(123, "abs");
	Object aa=new Object();
	System.out.println(qq.equals(ww));
	System.out.println(qq.equals(aa));
	System.out.println(qq.equals(ee));
	
}
}

