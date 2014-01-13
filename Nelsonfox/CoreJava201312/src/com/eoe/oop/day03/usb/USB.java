package com.eoe.oop.day03.usb;

public interface USB {
	
	public static final String KEYBOARD="键盘";
	public static final String PRINTLN="打印机";
	public static final String UDISK="U盘";
	public static final String MOUSE = "鼠标";
//	public static final String MOUSE = null;
	void read();
	void write();
}
