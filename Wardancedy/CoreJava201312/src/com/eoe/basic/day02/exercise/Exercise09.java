package com.eoe.basic.day02.exercise;

import java.io.InputStreamReader;
import java.util.Scanner;
/**
 * ��������һ����������Ҫ����0~5֮�䣬������5ʱ����Ϊ5����С��0ʱ����Ϊ0.
 * @author yw
 *
 */
public class Exercise09 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����һ����:");
		int score=scanner.nextInt();
		score=Math.max(0, Math.min(5, score));
		System.out.println(score);
	}
}
