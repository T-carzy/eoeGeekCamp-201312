package fun.dwords;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner=new Scanner(System.in);
	System.out.println("输入五分制的数");
	int score=scanner.nextInt();
	switch (score) {
	case 5:
		System.out.println("优秀");
		break;
	case 4:
		System.out.println("良好");
	case 3:
		System.out.println("及格");
	case 2:
		System.out.println(" ");
	case 1:
	System.out.println("不及格");
	case 0:
		System.out.println("补考");
	default:
		System.out.println("输入5分制的数");
		break;
	}
}
}