package com.eoe.oop.day03.usb;

public class Printer implements USB {

	@Override
	public void read() {
		System.out.println(USB.PRINTER + "读取主机发送的数据");
	}

	@Override
	public void write() {
		System.out.println(USB.PRINTER + "将数据打印在打印纸上");
	}

}
