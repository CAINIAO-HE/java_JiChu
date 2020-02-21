package studydemo;

public class chengfabiao {
	public static void main(String args[]) {
		int sum=0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
		        sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"  ");
			}//println输出时会换行而print输出时不会换行
			System.out.println();
		}
		
	}

}
