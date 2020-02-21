package day12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class IoByteStream
{
public static void main(
		String[] args
) {
	//文件字节输入流实例,输入指从文件输入到内存
	try
	{//FileInputStream类都要捕获异常，编辑时会提醒的
		FileInputStream in=new FileInputStream("E:/eclipse1/work_space/studydemo/huihui.txt");
		//因为是字节输入流，所以要建一个字节数组来接收流读取的内容
		byte[] b=new byte[20];//注意复习数组的声明
		int len=0;//设置读取数据的长度
		in.read(b);//把读取的数据放入b数组这个缓冲中
		len=in.read(b);//把read方法返回的字节长度返回给len
		/*in.read()读取到最后一个数据时还会向后再读一个并且返回-1，即read的返回值是-1时就读完了*/
	//b=in.readAllBytes();//把字节数据放入数组b
		while((len=in.read(b)) !=-1) {
			System.out.println(new String(b, 0, len));
			/*这个string方法的第一个参数b代表读取的数组，第二个参数0代表读取起点,第三个参数代表要读取的长度
			 * 这种就可以解决数组多读问题*/
		}
		//System.out.println(new String(b));普通读取
		in.close();//切记流最后要关闭！！！！！
	} catch (Exception e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
