package com.eoe.pre.oop.day03.entity;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.Printer;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;

public class Test04 {
	public static void main(String[] args) {
		USB[] usb = new USB[4];
		usb[0] = new Mouse();
		usb[1] = new Keyboard();
		usb[2] = new Printer();
		usb[3] = new Udisk();
		for (int i = 0; i < usb.length; i++) {
			usb[i].read();
			usb[i].write();
		}
	}
}
