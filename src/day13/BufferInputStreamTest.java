package day13;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferInputStreamTest
{
	
	public static void main(
			String[] args
	) {
		String path="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\testBufferInputStream.txt";
		//�ı����ڰ�day13������Ҫ���ҵ�·�����һ�testBufferInputStream.txt������·�properties�Ϳ����ҵ�·����
		try
		{
			BufferInputStreamTest.testBufferInputStream(path);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testBufferInputStream(String path) throws Exception {
		//�Ƚ�һ���ļ��ֽ�������
		FileInputStream inputStream=new FileInputStream(path);//���ѡ���׳��쳣
		//��һ����������Ŀ���ǰ��ֽ��������ݷŵ�����������ӿ����ݷ���
		BufferedInputStream br=new BufferedInputStream(inputStream);
		//��������й��췽�����β����ֽ�������
		//��Ϊ���ֽ����ݣ�����Ӧ�ý�һ���ֽ���������������
		byte[] ba=new byte[30];//���1024
		int len=0;//��ȡ����
		while((len=br.read(ba))!=-1) {
          System.out.println(new String(ba, 0, len));//��ȡ���
		}
		//�ر���ʱҪ��ѭ������Ҫ����أ���������
		br.close();//������ɺ�Ҫ�ǵùر���
		inputStream.close();
		
		
	}
}
