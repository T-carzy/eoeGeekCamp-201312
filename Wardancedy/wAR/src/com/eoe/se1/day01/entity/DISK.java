package com.eoe.se1.day01.entity;

import com.eoe.day03.USB.USB;

public class DISK implements USB {

	@Override
	public void read() {
		// TODO Auto-generated method stub
System.out.println(USB.DISK+"读取用户的内存数据");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
System.out.println(USB.DISK+"将用户的内存数据传送给主机");
	}

}
