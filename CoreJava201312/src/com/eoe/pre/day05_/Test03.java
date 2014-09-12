package com.eoe.pre.day05_;

public class Test03 {

	/**
	 * 用双重循环打印九九表。
	 */
	public static void main(String[] args) {
//		int i=1;
//		for(int j=1;j<=9;j++){
//			if(i*j<10){
//				System.out.print(i+"*"+j+"= "+i*j+" ");
//			}else{
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//		}
//		System.out.println();
//		i++;//i=2
//		for(int j=1;j<=9;j++){
//			if(i*j<10){
//				System.out.print(i+"*"+j+"= "+i*j+" ");
//			}else{
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//		}
//		//ctrl+f
//		System.out.println();
//		i++;//i=3
//		for(int j=1;j<=9;j++){
//			if(i*j<10){
//				System.out.print(i+"*"+j+"= "+i*j+" ");
//			}else{
//				System.out.print(i+"*"+j+"="+i*j+" ");
//			}
//		}
//		System.out.println();
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				if(i*j<10){
					System.out.print(i+"*"+j+"= "+i*j+" ");
				}else{
					System.out.print(i+"*"+j+"="+i*j+" ");
				}
			}
			System.out.println();	
		}
	}

}
