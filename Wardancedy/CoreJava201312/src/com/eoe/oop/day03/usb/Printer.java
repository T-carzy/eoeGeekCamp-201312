package com.eoe.oop.day03.usb;

public class Printer implements USB {

	@Override
	public void read() {
		System.out.println(USB.PRINTER+"��ȡ�������͵�����");
	}

	@Override
	public void write() {
		System.out.println(USB.PRINTER+"�����ݴ�ӡ�ڴ�ӡֽ��");
	}

}
