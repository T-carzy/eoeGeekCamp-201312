package com.eoe.pre.day01;

public class Test18 {

	/**
	 * continue;��������ѭ��֮������ִ����һѭ������
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 1;; i++) {
			if (i <= 20) {
				System.out.println("�������Գ�" + i + "��");
				continue;
			}
			if (i <= 100) {
				System.out.println("����..����..." + i + "��");
				continue;
			}
			System.out.println("������֧������Over!");
			break;
		}
	}

}
