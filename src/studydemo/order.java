package studydemo;

public class order
{
int orderId;
String orderNmae;
public order(int orderid,String ordername) {//���췽��
	this.orderId=orderid;
	this.orderNmae=ordername;
}
public int getOrderId(/*�Ҽ���source-->Generate getter and setter
��Ҫ����get��set�����ı�����Ȼ��ָ��*/
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
	if (obj instanceof order)//�ж��β��ǲ���order����
	{
		order aa=(order) obj;/*�Ѹ���objǿתΪ�������Ͷ���
		�����β���order�������Ǹ���������Ҫǿת*/
		if (this.orderId==aa.orderId&&this.orderNmae.equals(aa.orderNmae))
		{//��Ϊorderid��int����������==��ordername��string����������equals
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

