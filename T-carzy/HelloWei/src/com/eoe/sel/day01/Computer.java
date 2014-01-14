package com.eoe.sel.day01;

import com.eoe.pre.oop.day03.entity.USB;

public class Computer {
		private Memory memory;
		public USB[] usbs=new USB[4];
		public Computer() {
				memory=new Memory();
		}
		public void start(){
			memory.read();
			memory.write();
		}
		public void run(){
			for(USB usb:usbs){
				if(usb!=null){
					usb.read();
					usb.write();
				}
			}
		}
		private class Memory implements USB{

			@Override
			public void read() {
					System.out.println("内存读取外部的设备");
			}

			@Override
			public void write()
			{
					System.out.println("将内存中的数据保存至外部设备");
			}
				
	
}
}
