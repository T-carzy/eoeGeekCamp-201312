package com.eoe.se1.day01;

import com.eoe.oop.day03.usb.USB;

public class Test02 {
	static Computer computer = new Computer();

	public static void main(String[] args) {
		Test02 t = new Test02();
		t.createscanner();
		computer.usbs[0].read();
		computer.usbs[0].write();
	}

	void createscanner() {
		final String scannerName = "扫描仪";
		USB scanner = new USB() {

			@Override
			public void write() {
				System.out.println(scannerName + "将扫描的数据发送到主机");
			}

			@Override
			public void read() {
				System.out.println(scannerName + "正在扫描纸质文件");
			}
		};
		computer.usbs[0] = scanner;

	}
}
