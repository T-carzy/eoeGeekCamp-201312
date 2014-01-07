package com.eoe.pre.textday05;
import java.util.Scanner;
/**
 * 打印以下n行n列的字符图形，n由键盘输入
 *     *****
 *     *****
 *     *****
 *     *****
 *     *****
 */
public class Crazy04 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
