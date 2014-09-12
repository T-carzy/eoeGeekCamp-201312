package com.eoe.se1.day01.entity;

import ClassTestbasic.day01.copy.Test06;

import com.eoe.day03.USB.USB;

public class Test01 {
	static Computer computer=new Computer();
	public static void main(String[] args) {
		Test01 t=new Test01();
		 t.createScanner();
		computer.usbs[0].read();
		computer.usbs[0].write();
	}
	void createScanner(){
		final String scannerName="扫描仪";		
		USB scanner=new USB() {
			//String scannerName="扫描仪";
			@Override
			public void write() {
				//scannerName="打印机";
				System.out.println(scannerName+"将扫描的数据发送至主机");
			}
			
			@Override
			public void read() {
				System.out.println(scannerName+"正在扫描纸质文件");
			}
		};
		computer.usbs[0]=scanner;
	}
	
}

