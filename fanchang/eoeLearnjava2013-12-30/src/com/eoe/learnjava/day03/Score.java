package com.eoe.learnjava.day03;

import java.util.Scanner;

public class Score {

	/**��������java��android��sql���Ʒ���
	 * �ҳ���߷�
	 * @param args
	 */
	public static void main(String[] args) {
		//�ų���
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("java��android��sql�ĳɼ���");
//		int java = scanner.nextInt();
//		int android = scanner.nextInt();
//		int sql = scanner.nextInt();
//		if(java>=android&&java>=sql){
//			System.out.println("��߷֣�"+java);
//		}else if(android>=sql){
//			System.out.println("��߷֣�"+android);
//		}else{
//			System.out.println("��߷֣�"+sql);
//		}
		
		//ѡ��
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("java��android��sql�ĳɼ���");
		int java = scanner.nextInt();
		int android = scanner.nextInt();
		int sql = scanner.nextInt();
		int max = java;
		if(max < android){
			max = android;
		}
		if(max<sql){
			max = sql;
		}
			System.out.println("��߷֣�"+max);
	}

}
