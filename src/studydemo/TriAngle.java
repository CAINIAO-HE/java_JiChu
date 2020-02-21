package studydemo;

public class TriAngle
{
  private int base;
  private int heigh;
  public TriAngle(int m,int n) {//构造的方法来初始化,一旦自定义构造方法就不会用默认的构造方法了
	  base=m;
	  heigh=n;
  }
  public double sircl() {
	  double sum;
	  sum=(0.5)*(base*heigh);
	  return sum;
  }
	

}
