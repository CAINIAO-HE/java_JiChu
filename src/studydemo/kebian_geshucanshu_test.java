package studydemo;

public class kebian_geshucanshu_test
{
   public static void main(String args[]) {
	   kebian_geshucanshu test=new kebian_geshucanshu();
	   String[] ss=new String[] {"201614519","������"};
	   test.printInfo(ss);//����1,����ʱ���˴�������Ҳ����ֱ��д�β���ȥ��������
	   String[] as=new String[] {"202014519","��˧��"};
	   test.printfinfoa(as);//������
	   
	   /*1.���������β������巽��
  Public static void test(int a, String[] books);

         2.���ÿɱ�����βε������巽��
 Public static void test(int a,String...books)
	    *3. ������ʽ����������������������...��������
	    * 4.3.�ɱ����������ʹ���뷽����������ʹ��������һ�µ�
         Eg: public void printinfo(String... args){//�β��ǿɱ��������
             for(int i=0;i<args.length;i++){
             System.out.println(args[i]);//һ�������ò���
            }
           }
	    * */
	  
   }
}
