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
		String Fpath="E:/eclipse1/work_space/studydemo/慧慧可爱.txt";
		try
		{
			BufferFile.bufferReader(Fpath);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String bopath="E:\\eclipse1\\work_space\\studydemo\\蛋蛋我也爱.txt";
		String s="蛋蛋你还在生我的气吗?";
		try
		{
			BufferFile.buferOutput(bopath, s);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String fipath="E:\\eclipse1\\work_space\\studydemo\\蛋蛋我也爱.txt";
		String fopath="E:\\eclipse1\\work_space\\studydemo\\爱蛋蛋\\\\蛋蛋我也爱.txt";
		try
		{
			BufferFile.bufferFileCopy(fipath, fopath);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//文件字符缓冲流
	public static void bufferReader(String Fpath) throws Exception {
		//创建文件字符输入流
		FileReader fr=new FileReader(Fpath);
		//创建文件字符缓冲输入流
		BufferedReader br=new BufferedReader(fr);
		//因为读取的数据是字符所以要创建一个字符数组来保存从硬盘读取的文件
		char[] cb=new char[30];
		int len=0;//接收读取到的数组长度
		//读取数据到数组cb
		while((len=br.read(cb))!=-1) {//把数据读取并且放入bya数组,read读取到最后一位的后一位会返回-1
			//输出数据
			System.out.println(new String(cb, 0, len));
			//输出数据参数1是指从cb数组读取数据，参数二指从数组下标0开始读，参数三指读取长度
		}
		br.close();
		fr.close();//关闭流
	}
	//文件字符输出缓冲流
	public static void buferOutput(String bopath,String s) throws Exception {
		//创建文件字符输出流
		FileWriter fw=new FileWriter(bopath);
		//创建文件字符输出缓冲流
		BufferedWriter bw=new BufferedWriter(fw);
		//写数据
		bw.write(s);
		bw.flush();//刷入硬盘
		bw.close();
		fw.close();//关闭流
	
	}
	//文件字符拷贝粘贴
	public static void bufferFileCopy(String fipath,String fopath) throws Exception {
		//fipath是数据提取路径而fopath是粘贴路劲
		//建立字符文件输入流
		FileReader frb=new FileReader(fipath);//是要抛出异常的
		//建立文件字符缓冲流
		BufferedReader brb=new BufferedReader(frb);
		/*把文件输入流对象放入缓冲流中相当于把数据放入了内存中加快了数据访问速度*/
		//建立文件字符输出流
		FileWriter fwb=new FileWriter(fopath);
		//建立文件字符缓冲流
		BufferedWriter bwb=new BufferedWriter(fwb);
		//建立一个字符数组用于暂存数据
		char [] cb=new char[30];
		//从硬盘读数据并且放入cb数组
		int len=0;//接收读取长度
		while((len=brb.read(cb))!=-1) {
			//写，把数据写入内存
			bwb.write(cb, 0, len);//各个参数意义见以往注解
		}
		bwb.flush();//刷入硬盘
		bwb.close();
		fwb.close();
		brb.close();
		frb.close();//切记要关闭流
		
		
	}
}
