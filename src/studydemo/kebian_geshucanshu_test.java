package studydemo;

public class kebian_geshucanshu_test
{
   public static void main(String args[]) {
	   kebian_geshucanshu test=new kebian_geshucanshu();
	   String[] ss=new String[] {"201614519","何兴龙"};
	   test.printInfo(ss);//方法1,调用时除了传递数组也可以直接写形参上去个数不限
	   String[] as=new String[] {"202014519","大帅逼"};
	   test.printfinfoa(as);//方法二
	   
	   /*1.采用数组形参来定义方法
  Public static void test(int a, String[] books);

         2.采用可变个数形参的来定义方法
 Public static void test(int a,String...books)
	    *3. 声明方式：方法名（参数的类型名...参数名）
	    * 4.3.可变参数方法的使用与方法参数部分使用数组是一致的
         Eg: public void printinfo(String... args){//形参是可变个数参数
             for(int i=0;i<args.length;i++){
             System.out.println(args[i]);//一个个调用参数
            }
           }
	    * */
	  
   }
}
