package studydemo;

public class teshu_kongzhi {
	public static void main(String args[]) {
		for (int i = 0; i < 9; i++) {
			if (i%2==0) {
				continue;/*
				continue就是结束当前循环，直接进入下一循环
				在此处就是当i%2==0时就跳过system.out.println(i);
				就是相当于不再执行continue语句后面的语句
				直接进入新的一轮循环

*/
			}
			System.out.println(i);
		}
		
	}

}
