package com.eoe.sel.day01;

public class TestArithmeticException {


	public static void main(String[] args) {
			int a=200;
			int b=100;
			try {
				int c=a/b;
				System.out.println(c);
				int[] d=new int[2];
				System.out.println(d[2]);
				System.out.println("不会执行");
			} catch (ArithmeticException e) {
				System.out.println(e.toString());
				System.out.println("除零错误");
			}finally{
				System.out.println("无论是否异常都将执行");
			}
	}

}
