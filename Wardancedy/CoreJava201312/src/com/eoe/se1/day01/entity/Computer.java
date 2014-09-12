package com.eoe.se1.day01.entity;

import com.eoe.oop.day03.usb.USB;

public class Computer {
	private Memory memory;//�����Ա����
	public USB[] usbs=new USB[4];
	public Computer() {
		memory=new Memory();
		
	}
	//�������������
	public void start(){
		memory.read();
		memory.write();
	}
	//���нӿ�����
	public void run(){
		for(USB usb:usbs){
			if(usb!=null){
				usb.read();
				usb.write();
			}
		}
	}
	//���������ڴ���ڲ���
	private class Memory implements USB{
		@Override
		public void read() {
			System.out.println("�ڴ��ȡ���������");
		}

		@Override
		public void write() {
			System.out.println("���ڴ��е����ݱ������ⲿ����");
		}
	}
}
