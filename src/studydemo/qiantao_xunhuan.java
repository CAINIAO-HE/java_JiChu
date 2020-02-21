package studydemo;

public class qiantao_xunhuan {
	//嵌套循环的机理
	public static void main(String args[]) {
		for (int i = 0; i < 4; i++) {//大循环
         System.out.println("大循环执行："+i);
         for (int j = 0; j < 2; j++) {//小循环
        	 /*机理是这样的：
        	  * 大循环执行一次就进入小循环，
        	  * 然后小循环要执行完自己的循环才会回到大循环
        	  * 如此循环往复直到大循环执行完成。
        	  * 如这里第一次大循环执行0次然后进入小循环，
        	  * 然后小循环执行完自己的两次就回到大循环*/
			System.out.println("大循环执行了:"+i+"小循环执行了:"+j);
		}//小循环执行次数=大循环执行次数*小循环执行次数，如此处，小循环执行次数=4*2=8
		}
		
	}

}
