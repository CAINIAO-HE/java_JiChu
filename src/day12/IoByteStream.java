package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class IoByteStream
{
public static void main(
		String[] args
) {
	//�ļ��ֽ�������ʵ��,����ָ���ļ����뵽�ڴ�
	try
	{//FileInputStream�඼Ҫ�����쳣���༭ʱ�����ѵ�
		FileInputStream in=new FileInputStream("E:/eclipse1/work_space/studydemo/huihui.txt");
		//��Ϊ���ֽ�������������Ҫ��һ���ֽ���������������ȡ������
		byte[] b=new byte[20];//ע�⸴ϰ���������
		int len=0;//���ö�ȡ���ݵĳ���
		in.read(b);//�Ѷ�ȡ�����ݷ���b�������������
		len=in.read(b);//��read�������ص��ֽڳ��ȷ��ظ�len
		/*in.read()��ȡ�����һ������ʱ��������ٶ�һ�����ҷ���-1����read�ķ���ֵ��-1ʱ�Ͷ�����*/
	//b=in.readAllBytes();//���ֽ����ݷ�������b
		while((len=in.read(b)) !=-1) {
			System.out.println(new String(b, 0, len));
			/*���string�����ĵ�һ������b�����ȡ�����飬�ڶ�������0�����ȡ���,��������������Ҫ��ȡ�ĳ���
			 * ���־Ϳ��Խ������������*/
		}
		//System.out.println(new String(b));��ͨ��ȡ
		in.close();//�м������Ҫ�رգ���������
	} catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
