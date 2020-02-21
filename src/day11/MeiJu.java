package day11;



public class MeiJu
{
	public static void main(
			String[] args
	) {
		
		season sea=season.SPRING;//season.SPRING执行就是生成了一个season对象
		sea.showinfo();
		season sea1=season.SPRING;
		//表明season.SPRING每次执行生成的都是相同的对象，则枚举类中每个枚举都是单例模式的
		System.out.println(sea.equals(sea1));
	}


  
}
 enum season{
	//定义一个枚举类，不需要用关键字class
	SPRING("春天","慧慧你使我情窦初开"),//每一个小枚举都调用了一次构造方法
	SUMMER("夏天","慧慧你如你的名字，使我热烈"),
	AUTUMN("秋天","慧慧你如秋天，使我荡漾"),
	WINTER("冬天","慧慧你为什么冰冷如冬");
	 /*
	enum是以“ ，”隔开以"  ;"结束。如果每个枚举后面都跟 “ ；” 就相当于
	只声明了第一个枚举,其他的都不算，因为是以" ；"结尾的*/
	
	 private final String name;//属性都用private final修饰
	 private final String desv;
 
	 private season(String name,String desv) {
		 this.name=name;
		 this.desv=desv;
	 }
	public void showinfo() {
		System.out.println("季节:"+this.name+"  "+"描述:"+this.desv);
	}
}
