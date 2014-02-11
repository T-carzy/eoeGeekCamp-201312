package com.eoe.se1.day01.entity;

import com.eoe.day03.USB.USB;

import com.eoe.day03.USB.USB;

public class Computer {
	private CPU cpu;
	private DISK disk;
	private Memory memory;
	public USB[] usbs=new USB[4];
	public Computer() {
		memory=new Memory();
		
	}
	//代表启动计算机
	public void start(){
		memory.read();
		memory.write();
		cpu.read();
		cpu.write();
		disk.read();
		disk.write();
	}
	//运行接口外设
	public void run(){
		for(USB usb:usbs){
			if(usb!=null){
				usb.read();
				usb.write();
			}
		}
	}
	
	//代表计算机内存的内部类
	private class Memory implements USB{
		@Override
		public void read() {
			System.out.println("内存读取外设的数据");
		}

		@Override
		public void write() {
			System.out.println("将内存中的数据保存至外部磁盘");
		}
		//代表启动计算机
		public void start1(){
			cpu.read();
			cpu.write();
		}
		//运行接口外设
		public void run1(){
			for(USB usb:usbs){
				if(usb!=null){
					usb.read();
					usb.write();
				}
			}
		}
		private class Cup implements USB{
			@Override
			public void read() {
				System.out.println("内存读取外设的数据");
			}

			@Override
			public void write() {
				System.out.println("将内存中的数据保存至外部磁盘");
			}
			//代表启动计算机
			public void start2(){
				disk.read();
				disk.write();
			}
			//运行接口外设
			public void run2(){
				for(USB usb:usbs){
					if(usb!=null){
						usb.read();
						usb.write();
					}
				}
			}
			private class Disk implements USB{
				@Override
				public void read() {
					System.out.println("内存读取外设的数据");
				}

				@Override
				public void write() {
					System.out.println("将内存中的数据保存至外部磁盘");
				}
	}
	}
}
}