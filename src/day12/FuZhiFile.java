package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FuZhiFile
{
	public static void main(
			String[] args
	) {
		FuZhiFile.FuZhiFile();//��̬������������ֱ�ӵ���
	}

	public static void FuZhiFile() {
		try
		{
			FileInputStream in1=new FileInputStream("E:/eclipse1/work_space/studydemo/�ۻۿɰ�.txt");
			//Ҫ���뵽��������ļ�����(��ȡ��Դ�ļ�)
			FileOutputStream out2=new FileOutputStream("E:/eclipse1/work_space/studydemo/�ۻ�/�ۻۿɰ�.txt");
			//�Ѵ��������õ���������������ƣ������·����
			int len=0;//����һ����ȡ���ݵĳ���
			byte[] by=new byte[100];//��һ�������������������������
			//in1.read(by);//�������������ݷŵ�by���������д���,��������д�Ǵ���ģ���Ϊread�������з���ֵ�ġ����˻�Ҫд
			while((len=in1.read(by)) !=-1) {
				out2.write(by, 0, len);/*����д���ڴ�����
				�������,����1д���ǻ�������by,����2ָ��ʲô�����ʲôλ�ÿ�ʼ������3ָ��ȡ������ܳ���*/
				
			}
			out2.flush();//������д��Ӳ��
			out2.close();//д���˹ر������
			in1.close();//�����˹ر�������
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
