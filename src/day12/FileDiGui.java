package day12;

import java.io.File;

public class FileDiGui
{
	
	public static void main(String args[]) {
		File fi0=new File("E:\\\\\\\\eclipse1\\\\\\\\work_space\\\\\\\\studydemo\\\\爱慧慧");
		FileDiGui test=new FileDiGui();
		test.diGui(fi0);
	}
	
	
	
	
	//遍历出某个目录下所有的文件包括，此目录下的其他目录文件
public void diGui(File file) {
	//首先判断文件对象是文件还是文件夹再分类处理
	if (file.isFile())
	{//当是文件时就执行
		System.out.println(file.getAbsolutePath()+"是文件!");
	} else//当不是文件时就执行
	{
		System.out.println(file.getAbsolutePath()+"是文件夹!");
   File[] fi1=file.listFiles();//获取当前文件夹下的子文件或者文件对象
   //for each循环
   if (fi1 !=null&&fi1.length>0)
{
	 for(File fi2:fi1) {
	   //此时又要判断传进来的文件对象是文件还是文件夹了
		 diGui(fi2);//解决下面这种递归(套娃)的方法
		 
		 
		 
		 
//	   if (fi2.isFile())//当fi2是文件时执行,从这里开始就与第10行代码所要的功能一致了
//	{
//		System.out.println(fi2.getAbsolutePath()+"是文件!");
//	} else
//	{
//  File[] fi3=fi2.listFiles();//获取当前文件夹下的子文件或者文件对象
//  for(File fi4 :fi3) {
//	  /*此时就开始第20行代码的套娃行为了又要开始辨认是文件还是文件夹了然后
//	   * 根据情况来执行操作*/
//  }
//	}
	   
   }
}
  
	}
	
	
}
}
