package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Month {

	/**�����·ݣ���ʾ��������
	 * Ҫ�󣺲����Ƕ��·���������
	 * @param args
	 */
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ݣ�");
		int year = scanner.nextInt();
		System.out.println("�·�: ");
		int m = scanner.nextInt();
		switch (m){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("������31��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("������30��");
			break;
		case 2:
			if((year%400==0||year%4==0)&&year%100!=0){ /*�ж��Ƿ�������*/
				System.out.println("����28��");
			}else
			System.out.println("����29��");
			break;
		default:
			System.out.println("�·��������");
			break;
		}

	}

}
