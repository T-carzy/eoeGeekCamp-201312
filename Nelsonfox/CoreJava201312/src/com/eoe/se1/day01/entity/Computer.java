package com.eoe.se1.day01.entity;

import com.eoe.oop.day03.usb.USB;

public class Computer {
	private Memory memory;
	private Cpu cpu=new Cpu();
	private Disk disk=new Disk();
	public USB[] usbs = new USB[4];

	public Computer() {
		memory = new Memory();
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
	private class Cpu implements USB{

		@Override
		public void read() {
		System.out.println("CPU读取内存的数据");
			
		}

		@Override
		public void write() {
			System.out.println("CPU将指令放入指令寄存器");
			
		}
		
	}
	private class Disk implements USB{

		@Override
		public void read() {
			System.out.println("硬盘读取数据");
			
		}

		@Override
		public void write() {
		System.out.println("切记写保护");
			
		}
		
	}
}
