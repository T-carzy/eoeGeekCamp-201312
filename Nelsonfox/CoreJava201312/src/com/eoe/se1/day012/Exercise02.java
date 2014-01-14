package com.eoe.se1.day012;

import com.eoe.oop.day03.usb.USB;
import com.eoe.se1.day01.entity.Computer;

public class Exercise02 {
static Computer computer=new Computer();
	public Exercise02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Exercise02 e=new Exercise02();
	e.creatScanner();
	computer.usbs[0].read();
	computer.usbs[0].write();

	}
void creatScanner(){
	final String scannerName="扫描仪";
	USB scanner=new USB() {
		
		@Override
		public void write() {
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
