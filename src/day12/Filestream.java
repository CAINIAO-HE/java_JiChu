package day12;

import java.io.File;
import java.io.IOException;


public class Filestream
{
public static void main(String args[])  {
	File file=new File("E:\\eclipse1\\work_space\\studydemo\\huihui.txt");//���ļ������½��ļ�ʱ��Ҫ�Ѹ�ʽд��������
	
	//�½��ļ���������������huihui.txt
	//������ͬ������(�˽�)
	System.out.println(file.exists());//�ж��ļ��Ƿ����
	File f1=new File("E:\\eclipse1\\work_space", "studeydemo\\huihui.txt");
	/*ע�⣬\���ļ�����·���ָ�����������java��һ��\��
	 * ת���������\\��һ��/�Ŵ����ļ��еķָ�����һ��Ҫע��*/
	System.out.println(file.getName());//��ȡ�ļ���
	System.out.println(file.lastModified());//��ȡ�ļ�������Ϣ
	System.out.println("�ļ���·��");
	System.out.println(file.getPath());//��ȡ�ļ����ļ���·��
	System.out.println(file.getAbsolutePath());
	System.out.println("������·��");
	File f2=new File("/studydemo/src/day12/Filestream.java");
	//����ʹ�����������·���������ļ�����
	System.out.println(f2.getPath());
	//��ȡ·�����㵱����new File()����д����ʲô�����ʲô
	System.out.println(f2.getAbsolutePath());
	//Ҳ�����·�������������������·����������·��
	System.out.println("����һ����·�����ɵĶ���");
	System.out.println(f2);
	System.out.println(f2.getAbsoluteFile());//����һ���õ�ǰ����·�����ɵ��ļ�����,�����f2��˴���һ������
	System.out.println(f2.getParent());//��ȡ��·��
	file.renameTo(new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\�ۻ���ɰ�.txt"));
	//���ļ�������.��Ϊ�����в�����File�ļ�������Ҫnew File()
	System.out.println(file.isFile());//�ж��ǲ���һ���ļ�
	File f4=new File("E:\\eclipse1\\work_space\\studydemo\\�ۻۿɰ�.txt");
	System.out.println(f4.exists());
	if (!f4.exists())//�ж��ļ��Ƿ����
	{
		try
		{//�����׳��쳣��Ϊ����main�����׳�
			f4.createNewFile();//�����ļ�
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//f4.delete(); ɾ���ļ�
	File f5=new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\�ۻ�");
	f5.mkdir();//����һ������Ŀ¼
	/*����Ҫ�������Ŀ¼����Ҫһ��һ���ִ��mkdir()*/
	File f6 =new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\���ۻ�\\�ͻۻ�˯��");
	f6.mkdirs();//�������Ŀ¼
	System.out.println("����ļ����µ��Ӽ�");
	File f7=new File("E:\\\\\\\\eclipse1\\\\\\\\work_space\\\\\\\\studydemo");
	String[] s=f7.list();//����studydemo�ļ����µ������Ӽ���file���󣬰���Ŀ¼���ļ�
	//for each ����
	for(String s1:s) {//��s������һ��һ����s1
		System.out.println(s1);
		
	}
}
}
