package day12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IoOutputStream
{
	public static void main(String args[]) {
		IoOutputStream.IoOUtputStream();
	}
//�ļ����ʵ�������ָ���ڴ�������ļ�����
	public static void IoOUtputStream()  {
		try
		{
			FileOutputStream out=new FileOutputStream("E:/eclipse1/work_space/studydemo/�ۻۿɰ�.txt");
			//ָ�������Ŀ¼���ļ��������.ע��·������ȷ��д
			//IO������Ҫ�в����쳣����
			String s="Love huihui forever";
			out.write(s.getBytes());//��������д���ڴ���
			out.flush();//������д��Ӳ������
			out.close();//IO��������Ҫ�ر���
			
			
		} catch (Exception e)/*һ����˵���������������������
		      ������쳣ʱ�򲶻��쳣�����������Ϊ����Exception�����Ϳ���һ�°�
		      �����쳣������*/
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
