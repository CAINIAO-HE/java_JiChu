package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;



public class BufferFile
{
	public static void main(
			String[] args
	) {
		String Fpath="E:/eclipse1/work_space/studydemo/�ۻۿɰ�.txt";
		try
		{
			BufferFile.bufferReader(Fpath);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String bopath="E:\\eclipse1\\work_space\\studydemo\\������Ҳ��.txt";
		String s="�����㻹�����ҵ�����?";
		try
		{
			BufferFile.buferOutput(bopath, s);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fipath="E:\\eclipse1\\work_space\\studydemo\\������Ҳ��.txt";
		String fopath="E:\\eclipse1\\work_space\\studydemo\\������\\\\������Ҳ��.txt";
		try
		{
			BufferFile.bufferFileCopy(fipath, fopath);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//�ļ��ַ�������
	public static void bufferReader(String Fpath) throws Exception {
		//�����ļ��ַ�������
		FileReader fr=new FileReader(Fpath);
		//�����ļ��ַ�����������
		BufferedReader br=new BufferedReader(fr);
		//��Ϊ��ȡ���������ַ�����Ҫ����һ���ַ������������Ӳ�̶�ȡ���ļ�
		char[] cb=new char[30];
		int len=0;//���ն�ȡ�������鳤��
		//��ȡ���ݵ�����cb
		while((len=br.read(cb))!=-1) {//�����ݶ�ȡ���ҷ���bya����,read��ȡ�����һλ�ĺ�һλ�᷵��-1
			//�������
			System.out.println(new String(cb, 0, len));
			//������ݲ���1��ָ��cb�����ȡ���ݣ�������ָ�������±�0��ʼ����������ָ��ȡ����
		}
		br.close();
		fr.close();//�ر���
	}
	//�ļ��ַ����������
	public static void buferOutput(String bopath,String s) throws Exception {
		//�����ļ��ַ������
		FileWriter fw=new FileWriter(bopath);
		//�����ļ��ַ����������
		BufferedWriter bw=new BufferedWriter(fw);
		//д����
		bw.write(s);
		bw.flush();//ˢ��Ӳ��
		bw.close();
		fw.close();//�ر���
	
	}
	//�ļ��ַ�����ճ��
	public static void bufferFileCopy(String fipath,String fopath) throws Exception {
		//fipath��������ȡ·����fopath��ճ��·��
		//�����ַ��ļ�������
		FileReader frb=new FileReader(fipath);//��Ҫ�׳��쳣��
		//�����ļ��ַ�������
		BufferedReader brb=new BufferedReader(frb);
		/*���ļ�������������뻺�������൱�ڰ����ݷ������ڴ��мӿ������ݷ����ٶ�*/
		//�����ļ��ַ������
		FileWriter fwb=new FileWriter(fopath);
		//�����ļ��ַ�������
		BufferedWriter bwb=new BufferedWriter(fwb);
		//����һ���ַ����������ݴ�����
		char [] cb=new char[30];
		//��Ӳ�̶����ݲ��ҷ���cb����
		int len=0;//���ն�ȡ����
		while((len=brb.read(cb))!=-1) {
			//д��������д���ڴ�
			bwb.write(cb, 0, len);//�����������������ע��
		}
		bwb.flush();//ˢ��Ӳ��
		bwb.close();
		fwb.close();
		brb.close();
		frb.close();//�м�Ҫ�ر���
		
		
	}
}
