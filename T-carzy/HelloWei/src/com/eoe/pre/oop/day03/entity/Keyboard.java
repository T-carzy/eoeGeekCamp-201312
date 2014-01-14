package com.eoe.pre.oop.day03.entity;

public class Keyboard implements USB{

	@Override
	public void read() {
		System.out.println(USB.KEYBOARD+"接收用户的输入数据");
	}

	@Override
	public void write() {
		System.out.println(USB.KEYBOARD+"将用户的输入数据" +
				"发送至主机\n");
	}

}
