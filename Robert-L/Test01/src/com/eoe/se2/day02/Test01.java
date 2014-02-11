package com.eoe.se2.day02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 【示例-1】文件、文件夹的检测、创建和删除。
 * 
 * @author
 * 
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-检测文件夹是否存在");
		System.out.println("2-检测文件是否存在");
		System.out.println("3-创建文件夹");
		System.out.println("4-创建文件");
		int select = scanner.nextInt();
		switch (select) {
		case 1:// 检测文件夹是否存在
			checkfloder();
			break;
		case 2:// 检测文件是否存在
			checkfile();
			break;
		case 3:// 创建文件夹
			createfloder();
			break;
		case 4:// 创建文件
			createfile();
			break;
		}
	}

	private static void createfile() {
		String path = "E:\\java_test\\se2_day02\\day01";
		File dir = new File(path, "day04");
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println(dir.getAbsolutePath() + "文件夹已创建");
		}
		File file = new File(path, "Text05.java");
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file.getAbsolutePath() + "文件已创建");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void createfloder() {
		String path = "E:\\java_test\\se2_day02\\day02";
		File floder = new File(path);
		if (floder.exists()) {
			System.out.println(floder.getAbsolutePath() + "已存在");
		} else {
			floder.mkdirs();
			System.out.println(floder.getAbsolutePath() + "已创建");
		}

	}

	private static void checkfile() {
		String path = "E:\\java_test\\se2_day02\\day01\\Test01.java";
		File file = new File(path);
		if (file.exists()) {
			System.out.println(file.getAbsolutePath() + "已存在");
		} else {
			System.out.println(file.getAbsolutePath() + "不存在");
		}
	}

	private static void checkfloder() {
		String path = "E:\\java_test\\se2_day02\\day01";
		File floder = new File(path);
		if (floder.exists()) {
			System.out.println(floder.getAbsolutePath() + "已存在");
		} else {
			System.out.println(floder.getAbsolutePath() + "不存在");
		}
	}
}
