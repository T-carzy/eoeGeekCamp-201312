package com.ityw.se1.day01.entity;

import com.eoe.oop.day03.usb.USB;

public class Computer {
	private String name;
	private Memory memory;//定义Computer类的私有属性
	private Cpu cpu;
	private Disk  disk;
	 public USB[] usbs=new USB[4];
	 public Computer(String name) {
		 this.name = name;
	}

	public Computer() {
		
	}
	
	public void start() {
		//System.out.println(this.name+"在启动");
		this.memory=new Memory();
		this.memory.read();
		this.memory.write();
		
		//System.out.println(this.name+"在运行");
		this.cpu=new Cpu();
		this.cpu.read();
		this.cpu.write();
		//System.out.println(this.name+"在运行");
		this.disk=new Disk();
		this.disk.read();
		this.disk.write();
	}
	
	//定义内部类Memory
	private class Memory implements USB{
        //内存重写读方法
		@Override
		public void read() {
			System.out.println("内存在读取数据");
			
		}
       //内存重写写方法
		@Override
		public void write() {
			System.out.println("内存在保存数据");
		}
	}
	//定义内部类Cpu
	private class Cpu implements USB{
       //cpu重写读方法
		@Override
		public void read() {
			System.out.println("CPU在读数据");
		}
		//cpu重写写方法
		@Override
		public void write() {
			System.out.println("CPU在写数据");
		}
	}
	//定义内部类Disk
	private class Disk implements USB{

		@Override
		public void read() {
			System.out.println("disk在读数据");
		}

		@Override
		public void write() {
			System.out.println("disk在写数据");
		}
	}
	public void run() {
		for(USB usb:usbs){
			usb.read();
			usb.write();
			System.out.println();
		}
	}
}
