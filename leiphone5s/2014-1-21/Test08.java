package se2.day01;

import java.util.Arrays;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		String[] names = { "�ŷ�", "����", "�����", "����" };
		System.out.println(Arrays.toString(names));
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ɾ����λ��(1~4):");
		int index = scanner.nextInt();
		if (index > 0 && index < 5) {
			for (int i = index; i < names.length; i++) {
				names[i - 1] = names[i];
				names = Arrays.copyOf(names, names.length - 1);//��������м���
				System.out.println(Arrays.toString(names));
			}
		} else {
			System.out.println("��������ֲ��ڷ�Χ֮��");
		}
	}
}
