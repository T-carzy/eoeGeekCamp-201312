package com.eoe.se1.day03;

import java.util.HashMap;
import java.util.Scanner;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.Println;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;

public class Exercise04 {
static HashMap<String, USB> usbs;
	public Exercise04() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		initUsb();
System.out.println("1-添加一个外设\t2-卸载一个外设\t3-检测鼠标是否存在");
int select=new Scanner(System.in).nextInt();
switch (select) {
case 1:
//	usbs.put("udisk", udisk);
	//usbs.put("打印机", println);
	usbs.put("打印机", new Println());
	USB usb=usbs.get("打印机");
	System.out.println(usbs);
	break;
case 2:
	//usbs.put("键盘", new Keyboard());
	USB usb2=usbs.remove("键盘");
	System.out.println(usbs);
	break;
case 3:
	usbs.put("鼠标",new Mouse());
	if(usbs.containsKey("鼠标")){
		System.out.println("鼠标存在");
	}
default:
	break;
}
	}
static void initUsb(){
	usbs=new HashMap<String, USB>();
	Udisk udisk=new Udisk();
	usbs.put("udisk",udisk);
	Keyboard keyboard=new Keyboard();
	usbs.put("keyboard",keyboard);
	usbs.put("鼠标",new Mouse());
//	Println println=new Println();
//	usbs.put("打印机", println);

}
}
