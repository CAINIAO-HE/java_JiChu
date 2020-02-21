package day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.Filer;

public class FileZhiFu
{
  public static void main(
		String[] args
) {
	  //字符流只适合操作内容是字符的文件
	String s="E:/eclipse1/work_space/studydemo/慧慧可爱.txt";
	FileZhiFu.FileIO(s);
	String text="爱你，慧慧";
	String path="E:/eclipse1/work_space/studydemo/慧慧/爱你慧慧.txt";
	FileZhiFu.FileOutput(path, text);//前几次出错是把形参写反了
	FileZhiFu.copyFile("E:/eclipse1/work_space/studydemo/慧慧可爱.txt", "E:\\eclipse1\\work_space\\studydemo\\慧慧\\慧慧可爱.txt");
}
	public static void FileIO(String path) {
		try
		{
			FileReader reader= new FileReader(path);//创建文件字符输入流的对象
			//因为是字符，所以读取的数据应该存放在char类型数组
			char[] c=new char[100];
			int len=0;//定义一个输入流的读取长度
			//开始读
			while((len=reader.read(c))!=-1) {//read读的时候读到最后一个还会往后再读一个但是返回-1
				System.out.println(new String(c, 0, len));
				//输出信息，对数组c读从数组位置0开始，读取长度为len
				
			}
			reader.close();//一定要注意关闭流
			
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//文件字符输出流
	public static void FileOutput(String path,String text) {
		try
		{
			FileWriter writer=new FileWriter(path);//建一个文件字符输出流的对象
			writer.write(text);//把数据写到内存
			writer.flush();//把数据写到硬盘
			writer.close();//关闭流
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//字符流完成拷贝文件
	public static void copyFile(String inpath,String outpath) {
		try
		{
			FileReader reader1=new FileReader(inpath);
			FileWriter writer2=new FileWriter(outpath);
			char[] ch=new char[100];//创建输入流的缓冲数组
			int len=0;//定义读取的数据长度
			while((len=reader1.read(ch))!=-1) {
				writer2.write(ch, 0, len);//写
				
			}
			writer2.flush();//数据刷入硬盘
			writer2.close();
			reader1.close();
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
