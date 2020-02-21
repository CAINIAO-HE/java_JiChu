package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class ZhuanHuanStream
{
/*转换流可以把字节流转换为字符流，用在字节流的数据是字符时
 * ，当把字节流转换为字符流时效率更高*/
	public static void main(
			String[] args
	) {
		String fipath="E:\\eclipse1\\work_space\\studydemo\\src\\day13\\dandan.txt";
		String str="哈哈，蛋蛋最阔耐了";
		String outpath="E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\src\\\\day13\\\\zhuanhuanliu";
		try
		{
			ZhuanHuanStream.fileInputStreamToInputstreamReader(fipath);
			ZhuanHuanStream.outputDtreamToOutputStreamReader(outpath, str);
		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//文件字节流转换为字符流
	public static void fileInputStreamToInputstreamReader(String fipath) throws Exception {
		//建立文件字节流
		FileInputStream fis=new FileInputStream(fipath);
		//建立文件字符流,嵌套文件字节流对象也就把字节转换为了字符
		//InputStreamReader isr=new InputStreamReader(fis);
		InputStreamReader isr=new InputStreamReader(fis, "GBK");
		//encode就是编码，缓冲流的第一个参数是字节流对象，第二个参数是编码标准
		//因为是字节流转换为字符流，所以要建一个字符数组来暂存数据
		char[] ch=new char[30];
		//读数据到这个数组中
		//接收读取的数组长度
		int len=0;
		while((len=isr.read(ch))!=-1) {
			//输出数据
			System.out.println(new String(ch, 0, len));
			
		}
		//关闭流,晚开早关
		isr.close();
		fis.close();
		
		
	}
	//转换字节输出流为字符输出流
	public static void outputDtreamToOutputStreamReader(String outpath,String str) throws Exception {
		//建立字节输出流
		FileOutputStream fos=new FileOutputStream(outpath);
		//建立文件字符输出流
		OutputStreamWriter osw=new OutputStreamWriter(fos, "GBK");//注意编码格式要统一
		osw.write(str);//写数据
		osw.flush();
		osw.close();
		fos.close();
	}
	
}
