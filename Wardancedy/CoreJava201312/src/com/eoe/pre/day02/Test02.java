package com.eoe.pre.day02;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		String[] grades={"������","������","������","����","��","��"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("����5���Ƶķ���:");
		int score=scanner.nextInt();
		System.out.println(grades[score]);
	}

}
