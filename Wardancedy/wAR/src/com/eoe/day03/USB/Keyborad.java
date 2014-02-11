package com.eoe.day03.USB;

public class Keyborad implements USB {
	@Override
	public void read() {
		System.out.println(USB.KEYBORAD + "读取了用户的数据");
	}

	@Override
	public void write() {

		System.out.println(USB.KEYBORAD + "传送数据给主机");
	}
}
