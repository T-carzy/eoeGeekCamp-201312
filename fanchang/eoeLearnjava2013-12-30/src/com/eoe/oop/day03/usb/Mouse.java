package com.eoe.oop.day03.usb;

public class Mouse implements USB {

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println(USB.MOUSE+"�������û����ƶ�,�������");

	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println(USB.MOUSE+"��꽫�û����ƶ�,�����������������");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
