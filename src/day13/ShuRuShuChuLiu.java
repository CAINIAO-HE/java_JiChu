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
//在控制台用输入输出流输入数据并且打印到指定文本中，当接收到over时结束
	public static void writeTxt(String outpath) throws Exception {
		//建立输入流,从键盘获取数据。system.in默认键盘是输入设备
		InputStreamReader isra=new InputStreamReader(System.in);
		//把流放入缓冲流，提高效率
		BufferedReader bra=new BufferedReader(isra);
		//建立文件字符输出流指定输出路径
		FileWriter fWriter=new FileWriter(outpath);
		//建立缓冲输出流,把要输出的东西放在缓冲流里面提高效率
		BufferedWriter  bwa=new BufferedWriter(fWriter);
		//建立一个string变量接收输入的数据
		String line="";
		//readLine是读一串
		while((line=bra.readLine())!=null) {//读取数据，并将字符串符给line
			if (line.equals("over"))//要注意判断方法,如果接收到数据为over就结束
			{//equals方法是看值是不是一样，一样就返回true，==是看引用地址是不是一样
				break;//结体束本方法
			}
			bwa.write(line);//写数据
			//可以看到未来提高效率，都是把IO操作给缓冲流，其他输入输出流都是指定路径罢了
		}
		bwa.flush();//刷入硬盘
		bwa.close();//IO操作一定要关闭流
		fWriter.close();
		bra.close();
		isra.close();
		
	}
	public static void testUser(String inpath) throws Exception {
		//建立输入流，从键盘获取数据,
		InputStreamReader isrb=new InputStreamReader(System.in);
		//把从键盘接收的数据放入缓冲流
		BufferedReader brb=new BufferedReader(isrb);
		//建立文件字符输入流
		FileReader frb=new FileReader(inpath);
		//把从文件获取的数据放入缓冲流
		BufferedReader brc=new BufferedReader(frb);
		String txtfile="";
		String keyboard="";
		txtfile=brc.readLine();
		keyboard=brb.readLine();
		
		if (keyboard.equals(txtfile))
		{
			System.out.println("\n"+"登陆成功");
		} else
		{
     System.out.println("\n"+"登陆失败");
		}
		brc.close();
		frb.close();
		brb.close();
		isrb.close();
		
	}
}
