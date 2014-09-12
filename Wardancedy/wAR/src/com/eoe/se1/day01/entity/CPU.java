package com.eoe.se1.day01.entity;

import com.eoe.day03.USB.USB;

public class CPU implements USB {

	@Override
	public void read() {
	 System.out.println(USB.CUP+"读取数据给用户");
  
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
System.out.println(USB.CUP+"将用户的数据传送给主机");
	}

}
