package com.eoe.se1.day02;

import java.util.HashMap;
import java.util.Scanner;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.Printer;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;

public class Test03 {
	static HashMap<String, USB> usbs;

	public static void main(String[] args) {
		initUsb();
		System.out.println("1-添加一个外设\t2-卸载一个外设\t3-检测鼠标是否存在");
		int select = new Scanner(System.in).nextInt();
		switch (select) {
		case 1:
			Printer printer = new Printer();
			usbs.put("打印机", printer);
			System.out.println(usbs);
			break;
		case 2:
			usbs.remove(usbs.get("udisk"));
			System.out.println(usbs);
			break;
		case 3:
			if (usbs.containsKey("mouse")) {
				System.out.println(" 鼠标存在");
			} else {
				System.out.println("鼠标不存在");
			}

		}
	}

	static void initUsb() {
		usbs = new HashMap<String, USB>();
		Udisk udisk = new Udisk();
		usbs.put("udisk", udisk);
		Keyboard keyboard = new Keyboard();
		usbs.put("keyboard", keyboard);
		usbs.put("mouse", new Mouse());
		// Printer printer=new Printer();
		// usbs.put("printer",printer );
	}
}
