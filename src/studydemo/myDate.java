package studydemo;

public class myDate
{
int year;
int month;
int day;
public myDate(int year,int month,int day) {//���췽��
	this.year=year;
	this.month=month;
	this.day=day;
}
@Override
	public boolean equals(
			Object obj
	) {//alt+/������д��ݷ�ʽ
		// TODO Auto-generated method stub
	boolean value=false;
	if (obj instanceof myDate)
	{
		myDate op=(myDate)obj;//��objǿתΪmyDate���Ͷ���
		if (this.year==op.year&&this.month==op.month&&this.day==op.day)
		{//��Ϊ�����ն���int������==,���ַ���ʱ��equals()����
			value=true;
		}
	}
	else {
		value=false;
	}
	return value;
		//return super.equals(obj);
	
	}
public static void main(String args[]) {
	myDate aq=new myDate(2020, 2, 4);
	myDate aw=new myDate(2020, 2, 4);
	myDate date=new myDate(2019, 12, 30);
	System.out.println(aq.equals(aw));//��������Ƚ�
	System.out.println(aq.equals(date));
	System.out.println(aq.toString());//���������ڴ��ַ
	System.out.println(new Object().toString());
}
}
