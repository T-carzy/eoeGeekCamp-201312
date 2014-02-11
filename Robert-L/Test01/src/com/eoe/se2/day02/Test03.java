package com.eoe.se2.day02;

import java.util.Scanner;

/*
 *  lastModified()：返回该文件最后更改时间标志
 length()：返回文件长度
 list()：返回文件和目录清单
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-获取文件修改的最后时间");
		System.out.println("2-返回文件长度");
		System.out.println("3-获取当前文件夹下所有文件和文件夹");
		System.out.println("4-获取当前文件夹下所有java文件");
		int select = scanner.nextInt();
		switch (select) {
		case 1:// 获取文件修改的最后时间
			getfielemodifield();
			break;
		case 2://返回文件长度
			break;
		case 3://获取当前文件夹下所有文件和文件夹
			break;
		case 4://获取当前文件夹下所有java文件
			break;
		}
	}

	private static void getfielemodifield() {
   		
	}
}
