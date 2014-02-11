package com.eoe.oop.test;

import com.eoe.day03.USB.Keyborad;
import com.eoe.day03.USB.Mouse;
import com.eoe.day03.USB.Printer;
import com.eoe.day03.USB.USB;
import com.eoe.day03.USB.Udisk;
import com.eoe.day03.action.Company;
import com.eoe.day03.action.Computer;

public class TestUsb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		USB[] usb = new USB[4];
		usb[0] = new Mouse();
		usb[1] = new Keyborad();
		usb[2] = new Printer();
		usb[3] = new Udisk();
		for (int i = 0; i < usb.length; i++) {
			usb[i].read();
			usb[i].write();
		}
	}
}
