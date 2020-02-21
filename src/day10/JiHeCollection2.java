package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JiHeCollection2
{
public static void main(String args[]) {
	List<String> li=new ArrayList<String>();
	//新建一个泛型为string的list集合
	li.add("a");
	li.add("b");
	li.add("d");
	li.add("c");//把这些对象元素放入集合
	/*collections工具类可以直接调用自己的静态方法
	 * 不需要new一个对象来调用。随用随调故称为工具类*/
	System.out.println("调用工具类的方法来反转元素顺序");
	Collections.reverse(li);//调用工具类的方法来反转元素顺序
    System.out.println(li);
    System.out.println("对集合元素随机排序");
    Collections.shuffle(li);//对集合元素随机排序
    System.out.println(li);
    System.out.println("据元素的自然顺序进行升序排序");
    Collections.sort(li);//据元素的自然顺序进行升序排序
    System.out.println(li);
    System.out.println("把集合中的1处元素和3处元素进行交换");
    Collections.swap(li, 1, 3);
    //把集合中的i处元素和j处元素进行交换
    System.out.println(li);
    System.out.println("按自然顺序返回最大元素");
    //按自然顺序返回最大元素
    System.out.println(Collections.max(li));
    System.out.println("按自然顺序返回最小元素");
    System.out.println(Collections.min(li));
    
    
}
}
