package com.eoe.pre.oop.day03.entity;

public class Printer implements USB{

	@Override
	public void read() {
		System.out.println(USB.PRINTER+"获取主机发送的打印内容");
	}

	@Override
	public void write() {
		System.out.println(USB.PRINTER+"在打印纸上打印\n");
	}
		
}
