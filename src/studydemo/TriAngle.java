package studydemo;

public class TriAngle
{
  private int base;
  private int heigh;
  public TriAngle(int m,int n) {//����ķ�������ʼ��,һ���Զ��幹�췽���Ͳ�����Ĭ�ϵĹ��췽����
	  base=m;
	  heigh=n;
  }
  public double sircl() {
	  double sum;
	  sum=(0.5)*(base*heigh);
	  return sum;
  }
	

}
