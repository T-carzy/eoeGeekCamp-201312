package com.ityw.se1.day01.entity;

import com.eoe.oop.day03.usb.USB;

public class Computer {
	private String name;
	private Memory memory;//����Computer���˽������
	private Cpu cpu;
	private Disk  disk;
	 public USB[] usbs=new USB[4];
	 public Computer(String name) {
		 this.name = name;
	}

	public Computer() {
		
	}
	
	public void start() {
		//System.out.println(this.name+"������");
		this.memory=new Memory();
		this.memory.read();
		this.memory.write();
		
		//System.out.println(this.name+"������");
		this.cpu=new Cpu();
		this.cpu.read();
		this.cpu.write();
		//System.out.println(this.name+"������");
		this.disk=new Disk();
		this.disk.read();
		this.disk.write();
	}
	
	//�����ڲ���Memory
	private class Memory implements USB{
        //�ڴ���д������
		@Override
		public void read() {
			System.out.println("�ڴ��ڶ�ȡ����");
			
		}
       //�ڴ���дд����
		@Override
		public void write() {
			System.out.println("�ڴ��ڱ�������");
		}
	}
	//�����ڲ���Cpu
	private class Cpu implements USB{
       //cpu��д������
		@Override
		public void read() {
			System.out.println("CPU�ڶ�����");
		}
		//cpu��дд����
		@Override
		public void write() {
			System.out.println("CPU��д����");
		}
	}
	//�����ڲ���Disk
	private class Disk implements USB{

		@Override
		public void read() {
			System.out.println("disk�ڶ�����");
		}

		@Override
		public void write() {
			System.out.println("disk��д����");
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
