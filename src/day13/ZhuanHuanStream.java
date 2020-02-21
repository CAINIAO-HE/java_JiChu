package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class ZhuanHuanStream
{
/*ת�������԰��ֽ���ת��Ϊ�ַ����������ֽ������������ַ�ʱ
 * �������ֽ���ת��Ϊ�ַ���ʱЧ�ʸ���*/
	public static void main(
			String[] args
	) {
		String fipath="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\dandan.txt";
		String str="������������������";
		String outpath="E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\src\\\\day13\\\\zhuanhuanliu";
		try
		{
			ZhuanHuanStream.fileInputStreamToInputstreamReader(fipath);
			ZhuanHuanStream.outputDtreamToOutputStreamReader(outpath, str);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�ļ��ֽ���ת��Ϊ�ַ���
	public static void fileInputStreamToInputstreamReader(String fipath) throws Exception {
		//�����ļ��ֽ���
		FileInputStream fis=new FileInputStream(fipath);
		//�����ļ��ַ���,Ƕ���ļ��ֽ�������Ҳ�Ͱ��ֽ�ת��Ϊ���ַ�
		//InputStreamReader isr=new InputStreamReader(fis);
		InputStreamReader isr=new InputStreamReader(fis, "GBK");
		//encode���Ǳ��룬�������ĵ�һ���������ֽ������󣬵ڶ��������Ǳ����׼
		//��Ϊ���ֽ���ת��Ϊ�ַ���������Ҫ��һ���ַ��������ݴ�����
		char[] ch=new char[30];
		//�����ݵ����������
		//���ն�ȡ�����鳤��
		int len=0;
		while((len=isr.read(ch))!=-1) {
			//�������
			System.out.println(new String(ch, 0, len));
			
		}
		//�ر���,�����
		isr.close();
		fis.close();
		
		
	}
	//ת���ֽ������Ϊ�ַ������
	public static void outputDtreamToOutputStreamReader(String outpath,String str) throws Exception {
		//�����ֽ������
		FileOutputStream fos=new FileOutputStream(outpath);
		//�����ļ��ַ������
		OutputStreamWriter osw=new OutputStreamWriter(fos, "GBK");//ע������ʽҪͳһ
		osw.write(str);//д����
		osw.flush();
		osw.close();
		fos.close();
	}
	
}
