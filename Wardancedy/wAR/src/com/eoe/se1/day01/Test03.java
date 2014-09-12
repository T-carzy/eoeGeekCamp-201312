package com.eoe.se1.day01;

public class Test03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
class Number2{
	int a;
	int b;
	public Number2(){
		
	}
	public Number2(int a, int b){
		super();
		this.a=a;
		this.b=b;
	}
	@Override
	public String toString() {
		return "Number2 [a=" + a + ", b=" + b + "]";
	}
	void swap(Number2 num){
		int c=num.a;
		num.a=num.b;
		num.b=c;
	}
}
Number2 num2=new Number2(5,10);
System.out.println(num2);
num2.swap(num2);
System.out.println(num2);
	}

}
