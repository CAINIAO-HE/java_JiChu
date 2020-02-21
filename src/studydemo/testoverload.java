package studydemo;

import java.util.Scanner;

public class testoverload
{
	class MOL{//重载练习，
		/*重载注意事项:
		 * 重载依据参数数目，类型，及出现顺序来区分重载函数
		 * 在编写时不用考虑返回值类型，只需注意上面几点即可!
		 *  
		 * */
		int mol(int i) {
			return (i*i);
		}
		int mol(int a,int b) {
			return(a*b);
		}
		String mol(String op) {
			return op;
		}
		
	}
    public static void main(String args[]) {
    	MOL ol=new testoverload().new MOL();//静态方法调用动态类声明对象的格式，切记
    	int i=0,a=0,b=0;
    	String op;
    	Scanner in =new Scanner(System.in);
    	System.out.println("<平方和>");
    	System.out.println("请输入你的数据:");
    	i=in.nextInt();
    	System.out.println("平方和为:"+ol.mol(i));
    	System.out.println("<两数相乘>");
    	System.out.println("请输入你的两个数:");
    	a=in.nextInt();
    	b=in.nextInt();
    	System.out.println("乘积为:"+ol.mol(a, b));
    	System.out.println("请输入你想要输出的值:");
    	op=in.next();
    	System.out.println(op);
    }
}
