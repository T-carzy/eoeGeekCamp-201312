package com.eoe.oop.day03.usb;

public class Keyboard implements USB {

	@Override
	public void read() {
		System.out.println(USB.KEYBOARD+"�����û�����������");
	}

	@Override
	public void write() {
		System.out.println(USB.KEYBOARD+"���̽����û�����������");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
