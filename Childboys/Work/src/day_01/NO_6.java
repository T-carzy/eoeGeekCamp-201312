package day_01;

public class NO_6 {

	/**
	 * 编写Exercise05类，计算46天是几周零几天。
	 */
	public static void main(String[] args) {
		int a;//周
		int b;//日
		float c;
		int n=46;
		c=n/7;
		a=(int)c;
		b=n-a*7;
		System.out.println("46天有"+a+"周"+b+"日");

	}

}
