package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class FileZhiFu
{
  public static void main(
		String[] args
) {
	  //�ַ���ֻ�ʺϲ����������ַ����ļ�
	String s="E:/eclipse1/work_space/studydemo/�ۻۿɰ�.txt";
	FileZhiFu.FileIO(s);
	String text="���㣬�ۻ�";
	String path="E:/eclipse1/work_space/studydemo/�ۻ�/����ۻ�.txt";
	FileZhiFu.FileOutput(path, text);//ǰ���γ����ǰ��β�д����
	FileZhiFu.copyFile("E:/eclipse1/work_space/studydemo/�ۻۿɰ�.txt", "E:\\eclipse1\\work_space\\studydemo\\�ۻ�\\�ۻۿɰ�.txt");
}
	public static void FileIO(String path) {
		try
		{
			FileReader reader= new FileReader(path);//�����ļ��ַ��������Ķ���
			//��Ϊ���ַ������Զ�ȡ������Ӧ�ô����char��������
			char[] c=new char[100];
			int len=0;//����һ���������Ķ�ȡ����
			//��ʼ��
			while((len=reader.read(c))!=-1) {//read����ʱ��������һ�����������ٶ�һ�����Ƿ���-1
				System.out.println(new String(c, 0, len));
				//�����Ϣ��������c��������λ��0��ʼ����ȡ����Ϊlen
				
			}
			reader.close();//һ��Ҫע��ر���
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�ļ��ַ������
	public static void FileOutput(String path,String text) {
		try
		{
			FileWriter writer=new FileWriter(path);//��һ���ļ��ַ�������Ķ���
			writer.write(text);//������д���ڴ�
			writer.flush();//������д��Ӳ��
			writer.close();//�ر���
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//�ַ�����ɿ����ļ�
	public static void copyFile(String inpath,String outpath) {
		try
		{
			FileReader reader1=new FileReader(inpath);
			FileWriter writer2=new FileWriter(outpath);
			char[] ch=new char[100];//�����������Ļ�������
			int len=0;//�����ȡ�����ݳ���
			while((len=reader1.read(ch))!=-1) {
				writer2.write(ch, 0, len);//д
				
			}
			writer2.flush();//����ˢ��Ӳ��
			writer2.close();
			reader1.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
