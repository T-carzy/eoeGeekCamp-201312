package com.eoe.sel.day02;

import java.util.HashMap;
import java.util.Scanner;

import com.eoe.pre.oop.day03.entity.Keyboard;
import com.eoe.pre.oop.day03.entity.Mouse;
import com.eoe.pre.oop.day03.entity.USB;
import com.eoe.pre.oop.day03.entity.Udisk;

public class Test02 {
	static HashMap<String, USB> usbs;

	public static void main(String[] args) {
			initUsb();
			System.out.println("1-添加一个外设\t" +
					"2-卸载一个外设\t3-检测鼠标是否存在");
			int select=new Scanner(System.in).nextInt();
			switch(select){
			case 1:
				usbs=new HashMap<String,USB>();
				Udisk udisk=new Udisk();
				usbs.put("udisk", udisk);
				System.out.println("添加U盘");
				break;
			case 2:
				
				usbs.remove("udisk");
				System.out.println("U盘已删除");
				break;
			case 3:
				if(usbs.containsKey("mouse")){
					System.out.println("鼠标存在");
				}else{
					System.out.println("鼠标不存在");
				}
			}
	}

	private static void initUsb() {
		usbs=new HashMap<String,USB>();
		Udisk udisk=new Udisk();
		usbs.put("udisk", udisk);
		Keyboard keyboard=new Keyboard();
		usbs.put("keyboard", keyboard);
		usbs.put("mouse", new Mouse());
	}

}
