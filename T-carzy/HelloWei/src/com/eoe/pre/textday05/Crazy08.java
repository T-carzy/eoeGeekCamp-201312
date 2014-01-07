package com.eoe.pre.textday05;
/**
 * 打印以下字符图形，n由键盘输入
 *     *
 *     **
 *     ***
 *     ****
 *     *****
 */
import java.util.Scanner;
public class Crazy08 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
			{System.out.print("*");}
			System.out.println();
		}
	}
}
