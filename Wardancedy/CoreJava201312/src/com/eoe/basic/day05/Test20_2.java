package com.eoe.basic.day05;
import java.util.Scanner;
/*
  以导包的形式指明Test01、Test02和Test03这三个类从工作空间的
com/eoe/basic/day03文件夹下载入。
*/
import com.eoe.basic.day03.Test01;
import com.eoe.basic.day03.Test02;
import com.eoe.basic.day03.Test03;

public class Test20_2 {
	/**
	 * 本类是从com.eoe.basic.day03包下复制过来的Test11类，
	 * 类名已修改为Test11_2
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-第二章-Test01");
		System.out.println("2-第二章-Test02");
		System.out.println("3-第三章-Test01");
		System.out.println("4-第三章-Test02");
		System.out.println("5-第三章-Test03");
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			com.eoe.basic.day02.Test01.main(null);
			break;
		case 2:
			com.eoe.basic.day02.Test02.main(null);
			break;
		case 3:
			Test01.main(null);
			break;
		case 4:
			Test02.main(null);
			break;
		case 5:
			Test03.main(null);
			break;
		default:
			System.out.println("选择错误");
			break;
		}
	}
}
