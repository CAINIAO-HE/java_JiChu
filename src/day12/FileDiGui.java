package day12;

import java.io.File;

public class FileDiGui
{
	
	public static void main(String args[]) {
		File fi0=new File("E:\\\\\\\\eclipse1\\\\\\\\work_space\\\\\\\\studydemo\\\\���ۻ�");
		FileDiGui test=new FileDiGui();
		test.diGui(fi0);
	}
	
	
	
	
	//������ĳ��Ŀ¼�����е��ļ���������Ŀ¼�µ�����Ŀ¼�ļ�
public void diGui(File file) {
	//�����ж��ļ��������ļ������ļ����ٷ��ദ��
	if (file.isFile())
	{//�����ļ�ʱ��ִ��
		System.out.println(file.getAbsolutePath()+"���ļ�!");
	} else//�������ļ�ʱ��ִ��
	{
		System.out.println(file.getAbsolutePath()+"���ļ���!");
   File[] fi1=file.listFiles();//��ȡ��ǰ�ļ����µ����ļ������ļ�����
   //for eachѭ��
   if (fi1 !=null&&fi1.length>0)
{
	 for(File fi2:fi1) {
	   //��ʱ��Ҫ�жϴ��������ļ��������ļ������ļ�����
		 diGui(fi2);//����������ֵݹ�(����)�ķ���
		 
		 
		 
		 
//	   if (fi2.isFile())//��fi2���ļ�ʱִ��,�����￪ʼ�����10�д�����Ҫ�Ĺ���һ����
//	{
//		System.out.println(fi2.getAbsolutePath()+"���ļ�!");
//	} else
//	{
//  File[] fi3=fi2.listFiles();//��ȡ��ǰ�ļ����µ����ļ������ļ�����
//  for(File fi4 :fi3) {
//	  /*��ʱ�Ϳ�ʼ��20�д����������Ϊ����Ҫ��ʼ�������ļ������ļ�����Ȼ��
//	   * ���������ִ�в���*/
//  }
//	}
	   
   }
}
  
	}
	
	
}
}
