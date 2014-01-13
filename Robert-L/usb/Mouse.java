package com.eoe.oop.day03.usb;

public class Mouse implements USB {

	@Override
	public void read() {
		System.out.println(USB.MOUSE + "接收用户的移动、点击操作");
	}

	@Override
	public void write() {
		System.out.println(USB.MOUSE + "将用户的移动点击发送至主机");
	}
}
