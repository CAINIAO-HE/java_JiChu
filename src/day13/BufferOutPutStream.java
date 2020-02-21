package day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutPutStream
{
//�����ֽ������
	public static void main(
			String[] args
	) {
		String path="E:\\eclipse1\\work_space\\studydemo\\�ۻ���ɰ�.txt";
		String s="����Ӵ���ۻ�";
		BufferOutPutStream.testOutput(path, s);
		String inpath="E:\\eclipse1\\work_space\\studydemo\\�ۻ���ɰ�.txt";
		String outpath="E:\\eclipse1\\work_space\\studydemo\\�������ۻ�.txt";
		try
		{
			BufferOutPutStream.bufferCopy(inpath, outpath);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void testOutput(String path,String s) {
		
		try
		{//�ȴ���һ���ֽ������������ָ��Ҫд��Ӳ�̵�Ŀ¼·��
			FileOutputStream ou1=new FileOutputStream(path);
			//����һ�������ֽ���������ֽ����������������У��൱�ڰ����ݷŵ��ڴ�����ӿ������ݽ���
			BufferedOutputStream bo1=new BufferedOutputStream(ou1);
			//д�����ݵ��ڴ棬ע���������ַ�������Ҫ�Ȱ�����ת��Ϊ�ֽڲ���д��
			bo1.write(s.getBytes());//ע������Ĳ�����Ҫд������ݲ����ֽ����������,�����ֽ�����
			bo1.flush();//ˢ��Ӳ��
			//�ر����������������
			bo1.close();
			ou1.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//������ʵ���ļ�����
	public static void bufferCopy(String inpath,String outpath) throws Exception {
		//�����ֽ�������,ָ��·������·���µ�����д���ڴ�
		FileInputStream ina=new FileInputStream(inpath);
		//���ֽ���������������ֽڻ����������������ڴ�����ӿ����ݲ���Ч��
		BufferedInputStream bia=new BufferedInputStream(ina);
		//����һ���ֽ������ݴ���յ�����
		byte[] bya=new byte[30];
		//�����ֽ������
		FileOutputStream outa=new FileOutputStream(outpath);
		//�������������
		BufferedOutputStream boa=new BufferedOutputStream(outa);
		//��ʼ��
		int len=0;//�������ݳ���
		while((len=bia.read(bya))!=-1) {//�����ݶ�ȡ���ҷ���bya����,read��ȡ�����һλ�ĺ�һλ�᷵��-1
			//д���ڴ棬�൱�ڸ���
			boa.write(bya);//��bya�����ȡ����Ȼ��д���ڴ�
		}
		boa.flush();//���ˢ��Ӳ��
		//�ر�����ѭ�����
		boa.close();
		outa.close();
		bia.close();
		ina.close();
	}
	
}
