package com.eoe.basic.day05;
import java.util.Scanner;
/*
  �Ե�������ʽָ��Test01��Test02��Test03��������ӹ����ռ��
com/eoe/basic/day03�ļ��������롣
*/
import com.eoe.basic.day03.Test01;
import com.eoe.basic.day03.Test02;
import com.eoe.basic.day03.Test03;

public class Test20_2 {
	/**
	 * �����Ǵ�com.eoe.basic.day03���¸��ƹ�����Test11�࣬
	 * �������޸�ΪTest11_2
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-�ڶ���-Test01");
		System.out.println("2-�ڶ���-Test02");
		System.out.println("3-������-Test01");
		System.out.println("4-������-Test02");
		System.out.println("5-������-Test03");
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
			System.out.println("ѡ�����");
			break;
		}
	}
}
