package com.eoe.basic.day04;

public class Test20 {

	/**
	 *��д������㹫ʽ��
	 *(��10+��5)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)
	 */
	public static void main(String[] args) {
		double result=(add(10)+add(5))*(add(8)+add(4))/(myPow(2,8)-fact(5))+fact(4)-myPow(3,4);
		System.out.print("(��10+��5)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)=");
		System.out.println(result);
	}
	//����m��n�η�
	static double myPow(double m,int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=m;
		}
		return result;
	}
	//����n!
	static double fact(int n){
		double result=1;
		for(int i=1;i<=n;i++){
			result*=i;
		}
		return result;
	}
	//�����n
	static double add(int n){
		double result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
}
