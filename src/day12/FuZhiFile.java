package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FuZhiFile
{
	public static void main(
			String[] args
	) {
		FuZhiFile.FuZhiFile();//静态方法可以用类直接调用
	}

	public static void FuZhiFile() {
		try
		{
			FileInputStream in1=new FileInputStream("E:/eclipse1/work_space/studydemo/慧慧可爱.txt");
			//要输入到计算机的文件对象(读取的源文件)
			FileOutputStream out2=new FileOutputStream("E:/eclipse1/work_space/studydemo/慧慧/慧慧可爱.txt");
			//把从输入流得到的数据输出（复制）到这个路径下
			int len=0;//设置一个读取数据的长度
			byte[] by=new byte[100];//建一个缓冲数组接收输入流的数据
			//in1.read(by);//把输入流的数据放到by缓冲数组中待用,这里这样写是错误的，因为read读了是有返回值的。读了还要写
			while((len=in1.read(by)) !=-1) {
				out2.write(by, 0, len);/*数据写到内存里面
				输出数据,参数1写的是缓冲数组by,参数2指从什么数组的什么位置开始，参数3指获取数组的总长度*/
				
			}
			out2.flush();//把数据写入硬盘
			out2.close();//写完了关闭输出流
			in1.close();//读完了关闭输入流
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
