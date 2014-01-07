package com.eoe.pre.textday05;
import java.util.Scanner;
/**
 * 打印以下字符图形，n由键盘输入
 *     *
 *     **
 *     ***
 *     ****
 *     *****
 */
public class Crazy07 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int i=1;
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		i++;
		System.out.println();
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
		i++;
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		i++;
		System.out.println();
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		i++;
		System.out.println();
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		i++;
		System.out.println();
	}

}
