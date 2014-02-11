package com.eoe.sel02.day02;

import java.io.File;
import java.util.Scanner;

/*
 * 【示例-5】文件夹的进出。
 本例演示：进入下一级文件夹和返回上一级文件夹。
 进入下一级文件夹是指：进入当前文件夹下的第一个下一级文件夹。

 */
public class Test04 {
	public static void main(String[] args) {
		int select;
		String path = "e:/java_test";
		File dir = new File(path);
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("1-返回上一级文件夹");
			System.out.println("2-进入下一级文件夹");
			System.out.println("3-退出");
			select = scanner.nextInt();
			switch (select) {
			case 1:
				if (null != dir.getParentFile() && dir.getParentFile().exists()) {
					dir = dir.getParentFile();
					System.out.println(dir.getAbsolutePath());
					for (String file : dir.list()) {
						System.out.println(file);
					}
				} else {
					System.out.println("没有上一级文件夹");
				}
				break;
			case 2:
				File[] files = dir.listFiles();
				for (File file : files) {
					dir = file;
					System.out.println(dir.getAbsolutePath());
					break;
				}
				break;
			}
		} while (select != 3);
		System.out.println("退出操作");
	}
}
