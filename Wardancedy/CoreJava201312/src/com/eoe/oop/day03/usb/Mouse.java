package com.eoe.oop.day03.usb;

public class Mouse  implements USB{

	@Override
	public void read() {
		System.out.println(USB.MOUSE+"�����û����ƶ����������");
	}

	@Override
	public void write() {
		System.out.println(USB.MOUSE+"���û����ƶ��������������");
	}
}
