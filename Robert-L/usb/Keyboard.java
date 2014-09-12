package com.eoe.oop.day03.usb;

public class Keyboard implements USB {

	@Override
	public void read() {
		System.out.println(USB.KEYBORAD + "接收用户输入的字符");
	}

	@Override
	public void write() {
		System.out.println(USB.KEYBORAD + "将用户的击键操作发送至主机");
	}

}