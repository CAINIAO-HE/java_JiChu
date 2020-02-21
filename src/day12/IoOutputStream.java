package day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IoOutputStream
{
	public static void main(String args[]) {
		IoOutputStream.IoOUtputStream();
	}
//文件输出实例，输出指从内存输出到文件里面
	public static void IoOUtputStream()  {
		try
		{
			FileOutputStream out=new FileOutputStream("E:/eclipse1/work_space/studydemo/慧慧可爱.txt");
			//指定向这个目录的文件输出东西.注意路径的正确书写
			//IO操作都要有捕获异常操作
			String s="Love huihui forever";
			out.write(s.getBytes());//把数据先写到内存中
			out.flush();//把数据写到硬盘上面
			out.close();//IO操作必须要关闭流
			
			
		} catch (Exception e)/*一般来说如果代码里面有两处以上
		      会出现异常时则捕获异常的类可以声明为父类Exception这样就可以一下把
		      所有异常捕获了*/
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
