package com.eoe.learnjava.day06;

public class Multiplication_table {

	/**
	 * ��ӡ�žű�
	 * ȥ���ظ���
	 * @param args
	 */
	public static void main(String[] args) {
		//������
//		String space = " ";
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 1; j <= i; j++) {
//				if(i*j<10){
//					System.out.print(+i+"*"+j+"="+space+i*j+space+space);
//				}else{	
//				System.out.print(+i+"*"+j+"="+i*j+space+space);
//				}
//			}
//			System.out.println();
//		}
		//������
		String space = " ";
		for (int i = 1; i <= 9; i++) {
			for (int j = i; j <= 9; j++) {
				if(i*j<10){
					System.out.print(+i+"*"+j+"="+space+i*j+space+space);
				}else{	
				System.out.print(+i+"*"+j+"="+i*j+space+space);
				}
			}
			System.out.println();
		}

	}

}
