package com.eoe.basic.day04;

public class Test10 {
	public static void main(String[] args) {
		for(int i=1;;i++){
			if(i<20){				
				System.out.println("�������Գ�"+i+"��");
				continue;
			}
			if(i<100){
				System.out.println("����....����...");
				continue;
			}
			break;
		}
		System.out.println("������֧������Over��");
	}
}
