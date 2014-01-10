package com.eoe.learnjava.day05;
public class Formula {

	/**
	 * ��̼���һ�¹�ʽ: (��10+��5)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)
	 * Ҫ��:�����Ͻ������С�������λ
	 * @param args
	 */
	public static void main(String[] args) {
		double result = (addn(10)+addn(5))*(addn(8)+addn(4))/(pow(2,8)-
						fact(5))+fact(4)-pow(3,4);
		System.out.println("(��10+��5)*(��8+��4)/(pow(2,8)-5!)+4!-pow(3,4)=");
		System.out.println(pround(result, 3));
	}

	// ��ͷ���
	static int addn(int n){
		int a=0;
		for(int i=1;i<=n;i++){
			a+=i;
		}
		return a;
	}
	
	//��׳�
	static double fact(int n){
		int a=1;
		for(int i=1;i<=n;i++){
			a*=i;
		}
		return a;
	}
	
	//��ƽ��
	static int 	pow(int m,int n){
		int a=1;
		for(int i=1;i<=n;i++){
			a*=m;	
		}
		return a;
	}
	
	//����С�������λ
	static double pround(double x, int n){
		return Math.round(Math.pow(10, n)*x)*1.0/Math.pow(10, n);
	}
			
}
