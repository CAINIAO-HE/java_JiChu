package day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferOutPutStream
{
//缓冲字节输出流
	public static void main(
			String[] args
	) {
		String path="E:\\eclipse1\\work_space\\studydemo\\慧慧真可爱.txt";
		String s="爱你哟，慧慧";
		BufferOutPutStream.testOutput(path, s);
		String inpath="E:\\eclipse1\\work_space\\studydemo\\慧慧真可爱.txt";
		String outpath="E:\\eclipse1\\work_space\\studydemo\\哈哈哈慧慧.txt";
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
		{//先创建一个字节输出流，就是指定要写入硬盘的目录路劲
			FileOutputStream ou1=new FileOutputStream(path);
			//创建一个缓冲字节输出流把字节输出流对象放入其中，相当于把数据放到内存里面加快了数据交换
			BufferedOutputStream bo1=new BufferedOutputStream(ou1);
			//写入数据到内存，注意数据是字符的所以要先把数据转化为字节才能写入
			bo1.write(s.getBytes());//注意这里的参数是要写入的数据不是字节输出流对象,而是字节数据
			bo1.flush();//刷入硬盘
			//关闭流，最晚开的最早关
			bo1.close();
			ou1.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//缓冲流实现文件拷贝
	public static void bufferCopy(String inpath,String outpath) throws Exception {
		//创建字节输入流,指定路径，把路径下的数据写入内存
		FileInputStream ina=new FileInputStream(inpath);
		//把字节输入流对象放入字节缓冲输入流即放入内存里面加快数据操作效率
		BufferedInputStream bia=new BufferedInputStream(ina);
		//建立一个字节数组暂存接收的数据
		byte[] bya=new byte[30];
		//建立字节输出流
		FileOutputStream outa=new FileOutputStream(outpath);
		//建立缓冲输出流
		BufferedOutputStream boa=new BufferedOutputStream(outa);
		//开始读
		int len=0;//设置数据长度
		while((len=bia.read(bya))!=-1) {//把数据读取并且放入bya数组,read读取到最后一位的后一位会返回-1
			//写入内存，相当于复制
			boa.write(bya);//从bya数组读取数据然后写入内存
		}
		boa.flush();//最后刷入硬盘
		//关闭流遵循晚开早关
		boa.close();
		outa.close();
		bia.close();
		ina.close();
	}
	
}
