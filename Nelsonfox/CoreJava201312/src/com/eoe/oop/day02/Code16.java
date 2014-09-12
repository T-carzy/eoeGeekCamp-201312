package com.eoe.oop.day02;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.Println;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;

public class Code16 {
	public static void main(String[] args) {
		USB[] usb = new USB[4];
		usb[0] = new Keyboard();
		usb[1] = new Mouse();
		usb[2] = new Udisk();
		usb[3] = new Println();
		for (int i = 0; i < usb.length; i++) {
			usb[i].read();
			usb[i].write();
		}

	}

}
