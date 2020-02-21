package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



import day9.person;

public class TestDuiXiangStream
{
	/*��������л��뷴���л��Ķ���Ҫ���ָ߶�һ�£�һ�µ�������������������ȵ�����Ҫһ��
	 * �����������duixiangStream���ڰ�day13�½����ģ����罨��һ��day13.test�����ҽ�����ͬ��duixiangStream
	 * �ࡣ�������л��õ���day13�����Ķ���   �������л��õ���day13.test���������ô����ʱ�ͻ����׻ᱨ��
	 * 
	 * */
	public static void main(
			String[] args
	) {
		String opath="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\duixiangStream";
		String inpath="E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\src\\\\day13\\\\duixiangStream";
		try
		{
			//TestDuiXiangStream.testObjectOutStream(opath);
			TestDuiXiangStream.testDeserializable(inpath);
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��������л�
	public static void testObjectOutStream(String opath) throws Exception {
		//�������л�������ָ�����·��
		FileOutputStream fosd=new FileOutputStream(opath);
		ObjectOutputStream oos=new ObjectOutputStream(fosd);
		//ʵ��������
		duixiangStream duixiang=new duixiangStream();
		duixiang.name="�ۻ�";
		duixiang.age=11;
		//д����
		oos.writeObject(duixiang);
		//ˢ��Ӳ��
		oos.flush();
		//�ر���
		oos.close();
		fosd.close();
		
	}
	//����ķ����л���������Ӳ�������ȡ������Ϣ
	public static void testDeserializable(String indpath) throws Exception {
		//�����ļ�����������ָ����ȡ·��
		FileInputStream fips=new FileInputStream(indpath);
		//���������л�����
		ObjectInputStream ois=new ObjectInputStream(fips);
		//��ȡ����
		Object obj=ois.readObject();//readObject�������ص���obj��������Ҫ��һ��Object������������
		//��Ϊ������duixiangStream��������Ҫ��objǿתΪduixiangStream����
		duixiangStream test=(duixiangStream)obj;
		//�����л���ͰѶ�����תΪ�����ˣ��Ϳ��Ե��������
		System.out.println("name:"+test.name+"  "+"age:"+test.age);
		//�ر���
		ois.close();
		fips.close();
				
	}
}
