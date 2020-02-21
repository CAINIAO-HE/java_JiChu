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
	/*对象的序列化与反序列化的对象要保持高度一致，一致到包名，类名，类机构等等所有要一致
	 * 比如这里的类duixiangStream是在包day13下建立的，假如建立一个day13.test包并且建立相同的duixiangStream
	 * 类。假如序列化用的是day13这个类的对象   而反序列化用得是day13.test的这个类那么运行时就会乱套会报错
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
	//对象的序列化
	public static void testObjectOutStream(String opath) throws Exception {
		//建立序列化流并且指定输出路径
		FileOutputStream fosd=new FileOutputStream(opath);
		ObjectOutputStream oos=new ObjectOutputStream(fosd);
		//实例化对象
		duixiangStream duixiang=new duixiangStream();
		duixiang.name="慧慧";
		duixiang.age=11;
		//写对象
		oos.writeObject(duixiang);
		//刷入硬盘
		oos.flush();
		//关闭流
		oos.close();
		fosd.close();
		
	}
	//对象的反序列化，就是在硬盘里面读取对象信息
	public static void testDeserializable(String indpath) throws Exception {
		//建立文件输入流对象，指定读取路径
		FileInputStream fips=new FileInputStream(indpath);
		//建立反序列化对象
		ObjectInputStream ois=new ObjectInputStream(fips);
		//读取对象
		Object obj=ois.readObject();//readObject方法返回的是obj对象所以要建一个Object对象来接收它
		//因为对象是duixiangStream对象所以要把obj强转为duixiangStream对象
		duixiangStream test=(duixiangStream)obj;
		//反序列化后就把对象流转为对象了，就可以调用输出了
		System.out.println("name:"+test.name+"  "+"age:"+test.age);
		//关闭流
		ois.close();
		fips.close();
				
	}
}
