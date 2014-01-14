package com.eoe.pre.oop.day03.entity;

public class TestUSB {
	public static void main(String[] args) {
		USB [] usb=new USB[4];
		usb[0]=new Mouse();
		usb[1]=new Keyboard();
		usb[2]=new Printer();
		usb[3]=new Udisk();
		for (int i = 0; i < usb.length; i++) {
			usb[i].read();
			usb[i].write();
		}
	}

}
