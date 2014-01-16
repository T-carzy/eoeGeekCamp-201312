package com.eoe.oop.se1.day02;

import java.util.HashMap;
import java.util.Scanner;
import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;

public class Test07 {
	static HashMap<String, USB> usbs;

	public static void main(String[] args) {
		initUsb();
		System.out.println("1-���һ������\t2-ж��һ������\t3-�������Ƿ����");
		int select = new Scanner(System.in).nextInt();
		switch (select) {
		case 1:
			if (usbs.containsKey("udisk")) {
				execute(usbs.get("udisk"));
			}
			break;
		case 2:
			if (usbs.containsKey("keyboard")) {
				usbs.remove("keyboard");
			}
			break;
		case 3:
			if (usbs.containsKey("mouse")) {
				System.out.println("������");
			}
			break;
		default:
			System.out.println("��������ֲ��ڷ�Χ");
		}
		System.out.println(usbs.toString());
	}

	private static void execute(USB usb) {
		usb.read();
		usb.write();
	}

	static void initUsb() {
		usbs = new HashMap<String, USB>();
		Udisk udisk = new Udisk();
		usbs.put("udisk", udisk);
		Keyboard keyboard = new Keyboard();
		usbs.put("keyboard", keyboard);
		usbs.put("mouse", new Mouse());
	}
}
