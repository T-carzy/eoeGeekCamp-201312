package com.eoe.learnjava.day07;

import java.util.Scanner;

public class Look_up {

	/**ͨ������Ԫ�����±�
	 * ��������,�����������ж�Ӧ��λ��
	 * @param args
	 */
	public static void main(String[] args) {
		String[] name={"�ŷ�","���","�����","����","����"};
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������:");
		String named=scanner.next();
		for (int i = 0; i < name.length; i++) {
			if (named.equals(name[i])) {
				System.out.println(i+1);
			}
		}

	}

}
