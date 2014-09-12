package com.eoe.day03.USB;

public class Printer implements USB {
    @Override
	public void read() {
		System.out.println(USB.PRINTER+"读取主机发送的数据");
	}
    @Override
	public void write() {
		System.out.println(USB.PRINTER+"传送数据给主机");
	}
}
