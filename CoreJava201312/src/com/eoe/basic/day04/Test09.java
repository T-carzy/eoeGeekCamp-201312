package com.eoe.basic.day04;

public class Test09 {
	public static void main(String[] args) {
		for(int i=1;;i++){
			if(i<20){				
				System.out.println("�������Գ�"+i+"��");
			}else if(i<100){
				System.out.println("����...����..."+i+"��");
			}else{
				break;
			}
		}
		System.out.println("������֧������Over��");
	}
}
