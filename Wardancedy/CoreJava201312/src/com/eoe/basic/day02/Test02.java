package com.eoe.basic.day02;

/**
 * ������ʾ 
 * 1���������͵Ķ�������ɱ��������͵Ķ���
 * 2�������е����ݿ��Ըı䡣
 */
public class Test02 {
	public static void main(String[] args) {
		String name = "��С��";
		char sex = '��';
		int age = 23;
		double height = 1.2;
		boolean isMarry = false;// δ�飬true:�ѻ�
		System.out.println("�ˣ���Һã�����" + name + ",����" + age + "�꣬��ߣ�" + height
				+ "��\t�ѻ飺"+isMarry);
		//������ʾ����������µ����ݣ�ԭ�������ݶ�ʧ�ˡ�
		name = "�ܴ�˧";
		sex = '��';
		age = 26;
		height = 2.1;
		isMarry = true;// δ�飬true:�ѻ�
		System.out.println("�ˣ���Һã�����" + name + ",����" + age + "�꣬��ߣ�" + height
				+ "��\t�ѻ飺"+isMarry);
	}
}
