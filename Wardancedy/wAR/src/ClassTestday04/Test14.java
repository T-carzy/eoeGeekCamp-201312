package ClassTestday04;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int score;
		for(score=-1;score<0 || score>5;){
			System.out.println("输入5分制分数:");
			score=scanner.nextInt();
		}
		System.out.println("ok");
	}
}


