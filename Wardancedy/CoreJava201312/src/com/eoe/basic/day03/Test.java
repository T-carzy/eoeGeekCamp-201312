package com.eoe.basic.day03;

import java.util.Scanner;
/**
      现两个布尔变量值互换(不借助第三个变量)
       1 3 5 3 1  n=5  (n+1)/2=m
          *       1          2      1    1    2*(m-abs(m-i))-1
         ***      2          1      2    3
        *****     3          0      3    5
         ***      4          1      2    3
          *       5          2      1    1
      
 */
public class Test {
	String name;
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("n=");
		int n=scanner.nextInt();
		int m=(n+1)/2;
		for(int i=1;i<=n;i++){
			String space="";
			int k=2*(m-Math.abs(m-i))-1;
			for(int j=1;j<=Math.abs(m-i);j++){
				space+=" ";
			}
			System.out.print(space);
			for(int j=1;j<=k;j++){
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
