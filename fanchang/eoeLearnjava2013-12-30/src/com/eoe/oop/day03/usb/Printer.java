package com.eoe.oop.day03.usb;

public class Printer implements USB {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(USB.PRINTER+"��ȡ�������͵Ĵ�ӡ����");

	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println(USB.PRINTER+"�ڴ�ӡֽ�ϴ�ӡ");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
