package com.eoe.oop.day03.usb;

public class Keyboard implements USB {

	@Override
	public void read() {
		System.out.println(USB.KEYBORAD+"�����û�������ַ�");
	}

	@Override
	public void write() {
		System.out.println(USB.KEYBORAD+"���û��Ļ�����������������");
	}

}
