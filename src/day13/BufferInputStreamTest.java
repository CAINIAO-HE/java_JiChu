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
		//文本是在包day13建立的要想找到路径就右击testBufferInputStream.txt点击最下方properties就可以找到路径了
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
		//先建一个文件字节流对象
		FileInputStream inputStream=new FileInputStream(path);//这次选择抛出异常
		//建一个缓冲流，目的是把字节流的数据放到缓冲流里面加快数据访问
		BufferedInputStream br=new BufferedInputStream(inputStream);
		//这个声明中构造方法的形参是字节流对象
		//因为是字节数据，所以应该建一个字节数组来保存数据
		byte[] ba=new byte[30];//最高1024
		int len=0;//读取长度
		while((len=br.read(ba))!=-1) {
          System.out.println(new String(ba, 0, len));//读取输出
		}
		//关闭流时要遵循最晚开的要最早关，依次这样
		br.close();//所有完成后要记得关闭流
		inputStream.close();
		
		
	}
}
