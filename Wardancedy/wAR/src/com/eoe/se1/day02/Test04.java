package com.eoe.se1.day02;

import java.util.HashMap;
import java.util.Scanner;

import javax.naming.InitialContext;

import com.eoe.day03.USB.Keyborad;
import com.eoe.day03.USB.Mouse;
import com.eoe.day03.USB.Printer;
import com.eoe.day03.USB.USB;
import com.eoe.day03.USB.Udisk;
import com.eoe.se1.day01.entity.DISK;

public class Test04 {
	static HashMap<String, USB> usbs;

	public static void main(String[] args) {
		initUsb();
		System.out.println("1-添加一个外设\t2卸载一个外设\t3检查鼠标是否存在");
		int select = new Scanner(System.in).nextInt();
		switch (select) {
		case 1:
			Printer printer = new Printer();
			usbs.put("打印机", printer);
			System.out.println(printer);
			break;
		case 2:
			usbs.remove("printer");
			System.out.println("printer");
			break;
		case 3:
			if (usbs.containsKey("Mouse")) {
				System.out.println("存在");

			} else {
				System.out.println("不存在");
			}
			break;
		}
	}

	static void initUsb() {
		// TODO Auto-generated method stub
		usbs = new HashMap<String, USB>();
		Udisk udisk = new Udisk();
		usbs.put("udisk", udisk);
		Keyborad keyborad = new Keyborad();
		usbs.put("keyborad", keyborad);
		usbs.put("mouse", new Mouse());

	}
}
