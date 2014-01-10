package com.eoe.pre.oop.day01;
//用对象封装交换的两个变量，实现两个变量值互换
class Number{
	int a;
	int b;
	public Number(){
		
	}
	public Number(int a,int b){
		super();
		this.a=a;
		this.b=b;
	}
}
public class Exchange {
	static void suanShu(Number number){
		number.a+=number.b;
		number.b=number.a-number.b;
		number.a-=number.b;
	}

	public static void main(String[] args) {
			Number n=new Number(100,200);
			System.out.println(n.a+"  "+n.b);
			suanShu(n);
			System.out.println(n.a+"  "+n.b);
	}

}
