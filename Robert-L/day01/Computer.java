package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.USB;

public class Computer {
	private Memory memory;// 定义成员变量
	public USB[] usbs = new USB[4];

	public Computer() {
		memory = new Memory();
	}

	// 代表启动计算机
	public void start() {
		memory.read();
		memory.write();
	}

	// 运行接口外设
	public void run() {
		for (USB usb : usbs) {
			if (usb != null) {
				usb.read();
				usb.write();
			}
		}

	}

	// 代表计算机内存的内部类
	private class Memory implements USB {

		@Override
		public void read() {
			System.out.println("内存读取外设数据");
		}

		@Override
		public void write() {
			System.out.println("将内存中的数据保存至外部磁盘");
		}
	}
}