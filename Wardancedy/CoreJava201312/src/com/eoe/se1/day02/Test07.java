package com.eoe.se1.day02;

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
		System.out.println("1-添加一个外设\t2-卸载一个外设\t3-检测鼠标是否存在");
		int select=new Scanner(System.in).nextInt();
		switch (select) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
		}
	}
	static void initUsb() {
		usbs=new HashMap<String, USB>();
		Udisk udisk=new Udisk();
		usbs.put("udisk", udisk);
		Keyboard keyboard=new Keyboard();
		usbs.put("keyboard", keyboard);
		usbs.put("mouse", new Mouse());
	}
}
