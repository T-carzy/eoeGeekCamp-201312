package com.eoe.pre.day01;

public class Test22 {

	/**
	 * ����:(��8+��5)/(��8-��5)+5!-3!
	 */
	public static void main(String[] args) {
//		feeling("�������������","����....");
//		feeling("��ʧ����", "����...");
//		int result=add(5,3);
//		System.out.println(result);
		
		double result=(add(8)+add(5))/(add(8)-add(5))+fact(5)-fact(3);
		System.out.println(result);
	}
	
	//����n��  �ṹ(ģ��)���������ԭ����ľʽ
	static double fact(int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}
	//���㦲n
	static int add(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	
//	//������
//	static void feeling(String cause,String content){
//		System.out.print(cause);
//		System.out.println(content);
//	}
//	//Math.round(),pow()
//	static int add(int a,int b){
//		int result=a+b;
//		return result;
//	}
}
