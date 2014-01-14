package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.USB;

public class Computer1 {
	private Memory memory;// 定义成员变量
	private Cpu cpu;
	private Disk disk;
	public USB[] usbs = new USB[4];

	public Computer1() {
		memory = new Memory();
		cpu = new Cpu();
		disk = new Disk();
	}

	// 代表启动计算机
	public void start() {
		memory.read();
		memory.write();
		cpu.read();
		cpu.write();
		disk.read();
		disk.write();
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
			System.out.println("内存读取外设的数据");
		}

		@Override
		public void write() {
			System.out.println("将内存中的数据保存至外部磁盘");
		}
	}
		private class Cpu implements USB {

			@Override
			public void read() {
				System.out.println("计算数据");
			}

			@Override
			public void write() {
				System.out.println("存储数据");
			}
		}

		private class Disk implements USB {

			@Override
			public void read() {
				System.out.println("存储数据");
			}

			@Override
			public void write() {
				System.out.println("读取数据");
			}

		}

	}

