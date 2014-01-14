package com.eoe.pre.oop.day03;

import com.eoe.oop.day03.usb.USB;
import com.eoe.pre.oop.day03.entity.Computer;

public class Test18 {
		static Computer computer=new Computer();
		public static void main(String[] args) {
			Test18 t=new Test18();
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



