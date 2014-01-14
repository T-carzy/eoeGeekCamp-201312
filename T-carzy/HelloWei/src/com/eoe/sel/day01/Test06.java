package com.eoe.sel.day01;

import com.eoe.pre.oop.day03.entity.USB;

public class Test06 {
		static Computer computer=new Computer();
		

	public static void main(String[] args) {
			Test06 t=new Test06();
			t.createScanner();
			computer.usbs[0].read();
			computer.usbs[0].write();
	}
	void createScanner(){
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
