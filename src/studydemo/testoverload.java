package studydemo;

import java.util.Scanner;

public class testoverload
{
	class MOL{//������ϰ��
		/*����ע������:
		 * �������ݲ�����Ŀ�����ͣ�������˳�����������غ���
		 * �ڱ�дʱ���ÿ��Ƿ���ֵ���ͣ�ֻ��ע�����漸�㼴��!
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
    	MOL ol=new testoverload().new MOL();//��̬�������ö�̬����������ĸ�ʽ���м�
    	int i=0,a=0,b=0;
    	String op;
    	Scanner in =new Scanner(System.in);
    	System.out.println("<ƽ����>");
    	System.out.println("�������������:");
    	i=in.nextInt();
    	System.out.println("ƽ����Ϊ:"+ol.mol(i));
    	System.out.println("<�������>");
    	System.out.println("���������������:");
    	a=in.nextInt();
    	b=in.nextInt();
    	System.out.println("�˻�Ϊ:"+ol.mol(a, b));
    	System.out.println("����������Ҫ�����ֵ:");
    	op=in.next();
    	System.out.println(op);
    }
}
