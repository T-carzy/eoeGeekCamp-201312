package com.eoe.learnjava.day06;
import java.util.Scanner;


public class Login_check {

	/**
	 * ��֪ע���û���:ZhangFei,����zf007ZF
	 * ��дһ����½����,�����û���������
	 * Ҫ��:
	 * 1.�û������ƴ�Сд
	 * 2.����Ĵ�СдҪһ��
	 * 3.����ȷ��ɹ�
	 * 4.����ʱ��ʾ"���޴���",���������ʾ"�������",
	 * ��֤�ɹ���ʾ"��½�ɹ�"
	 * @param args
	 */
	public static void main(String[] args) {
		String user ="ZhangFei";
		String password="zf007ZF";
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("�������û���:");
			String usered=scanner.next();
			System.out.println("����������:");	
			String passworded=scanner.next();
			if (!usered.equalsIgnoreCase(user)) {
				System.out.println("���޴���!");
				break;
			} else if (!password.equals(passworded)) {
				System.out.println("�������!");
				break;
			} else {
				System.out.println("��½�ɹ�!");
				break;
			}
		} while (true);

	}

}
