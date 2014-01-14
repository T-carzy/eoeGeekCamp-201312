package com.eoe.sel.day01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test10 {


	public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("a[+,-,*,/] b=");
			int a=scanner.nextInt();
			char c=scanner.next().charAt(0);
			int b=scanner.nextInt();
			
				try {
					computer(a, c, b);
				} catch (OutOfIntMaxValueException e) {
					System.out.println(e.toString());
				} catch (DivideByZero e) {
					System.out.println(e.toString());
				}
			
	}
	private static void  computer(int a,char c,int b) 
			throws OutOfIntMaxValueException, DivideByZero{
		switch(c){
		case'+':
			System.out.println(a+b);
			break;
		case'-':
			System.out.println(a-b);
			break;
		case'/':
			
				if(b==0){
					throw new DivideByZero("除零错误");
				}
					System.out.println(a/b);
				
				
			break;
		case'*':
			
			if((double)a*b>Integer.MAX_VALUE){
				throw new OutOfIntMaxValueException("超出int最大值");
			}
			System.out.println(a*b);
			break;
			default:
				System.out.println("输入正确运算符号");
			
		}
		
	}
	static class OutOfIntMaxValueException extends Exception{
		public OutOfIntMaxValueException(String message){
			super(message);
		}
	}
	static class DivideByZero extends Exception{
		public DivideByZero(String message){
			super(message);
		}
	}
}
