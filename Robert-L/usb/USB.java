package com.eoe.oop.day03.usb;

public interface USB {
	public static final String MOUSE = "鼠标";
	public static final String KEYBORAD = "键盘";
	public static final String PRINTER = "键盘";
	public static final String UDISK = "U盘";

	void read();

	void write();
}
