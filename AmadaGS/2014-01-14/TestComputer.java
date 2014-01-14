package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.Keyboard;
import com.eoe.oop.day03.usb.Mouse;
import com.eoe.oop.day03.usb.USB;
import com.eoe.oop.day03.usb.Udisk;
import com.ityw.se1.day01.entity.Computer;

public class TestComputer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer computer =new Computer("苹果电脑");
		computer.start();
		computer.usbs[0]=new Udisk();
		computer.usbs[1]=new Keyboard();
		computer.usbs[2]=new Mouse();
	    computer.usbs[3]=new USB(){

			@Override
			public void read() {
				System.out.println("扫描仪将用户输入的数据发送至主机");
			}

			@Override
			public void write() {
				System.out.println("扫描仪接受用户的文件");
			}
	    };
	    computer.run();
	}

}
