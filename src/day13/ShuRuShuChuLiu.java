package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ShuRuShuChuLiu
{
	public static void main(
			String[] args
	) {
		String outpath="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\shuru.txt";
		String inpath="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\shuruStreamTest";
		try
		{
			//ShuRuShuChuLiu.writeTxt(outpath);
			ShuRuShuChuLiu.testUser(inpath);
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//�ڿ���̨������������������ݲ��Ҵ�ӡ��ָ���ı��У������յ�overʱ����
	public static void writeTxt(String outpath) throws Exception {
		//����������,�Ӽ��̻�ȡ���ݡ�system.inĬ�ϼ����������豸
		InputStreamReader isra=new InputStreamReader(System.in);
		//�������뻺���������Ч��
		BufferedReader bra=new BufferedReader(isra);
		//�����ļ��ַ������ָ�����·��
		FileWriter fWriter=new FileWriter(outpath);
		//�������������,��Ҫ����Ķ������ڻ������������Ч��
		BufferedWriter  bwa=new BufferedWriter(fWriter);
		//����һ��string�����������������
		String line="";
		//readLine�Ƕ�һ��
		while((line=bra.readLine())!=null) {//��ȡ���ݣ������ַ�������line
			if (line.equals("over"))//Ҫע���жϷ���,������յ�����Ϊover�ͽ���
			{//equals�����ǿ�ֵ�ǲ���һ����һ���ͷ���true��==�ǿ����õ�ַ�ǲ���һ��
				break;//������������
			}
			bwa.write(line);//д����
			//���Կ���δ�����Ч�ʣ����ǰ�IO�������������������������������ָ��·������
		}
		bwa.flush();//ˢ��Ӳ��
		bwa.close();//IO����һ��Ҫ�ر���
		fWriter.close();
		bra.close();
		isra.close();
		
	}
	public static void testUser(String inpath) throws Exception {
		//�������������Ӽ��̻�ȡ����,
		InputStreamReader isrb=new InputStreamReader(System.in);
		//�ѴӼ��̽��յ����ݷ��뻺����
		BufferedReader brb=new BufferedReader(isrb);
		//�����ļ��ַ�������
		FileReader frb=new FileReader(inpath);
		//�Ѵ��ļ���ȡ�����ݷ��뻺����
		BufferedReader brc=new BufferedReader(frb);
		String txtfile="";
		String keyboard="";
		txtfile=brc.readLine();
		keyboard=brb.readLine();
		
		if (keyboard.equals(txtfile))
		{
			System.out.println("\n"+"��½�ɹ�");
		} else
		{
     System.out.println("\n"+"��½ʧ��");
		}
		brc.close();
		frb.close();
		brb.close();
		isrb.close();
		
	}
}
