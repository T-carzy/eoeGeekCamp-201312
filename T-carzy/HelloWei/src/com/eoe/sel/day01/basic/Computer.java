package com.eoe.sel.day01.basic;

import com.eoe.pre.oop.day03.entity.USB;

public class Computer {
private static final DISK DISK = null;
//		private Memory memory;
//		public USB[] usbs=new USB[4];
//		public Computer() {
//				memory=new Memory();
//		}
//		public void start(){
//			memory.read();
//			memory.write();
//		}
//		public void run(){
//			for(USB usb:usbs){
//				if(usb!=null){
//					usb.read();
//					usb.write();
//				}
//			}
//		}
//		private class Memory implements USB{
//
//			@Override
//			public void read() {
//					System.out.println("内存读取外部的设备");
//			}
//
//			@Override
//			public void write()
//			{
//					System.out.println("将内存中的数据保存至外部设备");
//			}
//				
//	
//}
		private CPU cpu;
		private DISK disk;
		public USB[] usbs=new USB[6];
		public Computer(){
			cpu=new CPU();
			disk=new DISK();
		}
		public void start(){
			cpu.read();
			cpu.write();
			disk.read();
			disk.write();
			
		}
		public void run(){
			for(USB usb:usbs){
				if(usb!=null){
					usb.read();
					usb.write();
				}
			}
		}
		private static class CPU implements USB{

			@Override
			public void read() {
				System.out.println("CPU正在运行");
			}

			@Override
			public void write() {
				System.out.println("CPU快要爆了");
			}
			
			
			
		}

		
		
		private static class DISK implements USB{

			@Override
			public void read() {
				System.out.println("硬盘开始工作");
			}

			@Override
			public void write() {
				System.out.println("硬盘爆了");
			}
			
			}
		}

