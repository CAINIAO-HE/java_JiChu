package day12;

import java.io.File;
import java.io.IOException;


public class Filestream
{
public static void main(String args[])  {
	File file=new File("E:\\eclipse1\\work_space\\studydemo\\huihui.txt");//在文件夹中新建文件时不要把格式写在名称上
	
	//新建文件对象，这个对象就是huihui.txt
	//两种相同的声明(了解)
	System.out.println(file.exists());//判断文件是否存在
	File f1=new File("E:\\eclipse1\\work_space", "studeydemo\\huihui.txt");
	/*注意，\在文件中是路径分隔符，但是在java中一个\是
	 * 转义符，两个\\或一个/才代表文件中的分隔符。一定要注意*/
	System.out.println(file.getName());//获取文件名
	System.out.println(file.lastModified());//获取文件常规信息
	System.out.println("文件的路径");
	System.out.println(file.getPath());//获取文件或文件夹路劲
	System.out.println(file.getAbsolutePath());
	System.out.println("这个类的路径");
	File f2=new File("/studydemo/src/day12/Filestream.java");
	//这是使用这个类的相对路径创建的文件对象
	System.out.println(f2.getPath());
	//获取路径，你当初在new File()里面写的是什么就输出什么
	System.out.println(f2.getAbsolutePath());
	//也是输出路劲但是这是输出的完整路径，即绝对路径
	System.out.println("返回一个用路劲生成的对象");
	System.out.println(f2);
	System.out.println(f2.getAbsoluteFile());//返回一个用当前绝对路径生成的文件对象,上面的f2与此处是一个对象
	System.out.println(f2.getParent());//获取父路径
	file.renameTo(new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\慧慧真可爱.txt"));
	//给文件重命名.因为方法中参数是File文件，所以要new File()
	System.out.println(file.isFile());//判断是不是一个文件
	File f4=new File("E:\\eclipse1\\work_space\\studydemo\\慧慧可爱.txt");
	System.out.println(f4.exists());
	if (!f4.exists())//判断文件是否存在
	{
		try
		{//不能抛出异常因为会在main哪里抛出
			f4.createNewFile();//创建文件
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//f4.delete(); 删除文件
	File f5=new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\慧慧");
	f5.mkdir();//创建一个单层目录
	/*若是要创建多层目录，就要一层一层的执行mkdir()*/
	File f6 =new File("E:\\\\eclipse1\\\\work_space\\\\studydemo\\\\爱慧慧\\和慧慧睡觉");
	f6.mkdirs();//创建多层目录
	System.out.println("输出文件夹下的子集");
	File f7=new File("E:\\\\\\\\eclipse1\\\\\\\\work_space\\\\\\\\studydemo");
	String[] s=f7.list();//返回studydemo文件夹下的所有子集的file对象，包括目录与文件
	//for each 遍历
	for(String s1:s) {//把s的数据一个一个给s1
		System.out.println(s1);
		
	}
}
}
