package com.eoe.learnjava.day07;

import java.util.Scanner;

public class Di_gui {

	/**����n�Ľ׳�
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("n�Ľ׳�:");
		int n=scanner.nextInt();
		double result =fact(n);
		System.out.println(result);

	}
	static double fact(int n){
		if (n==1) {
			return 1;
		}
		double result=n*fact(n-1);
		return result;
	}

}
