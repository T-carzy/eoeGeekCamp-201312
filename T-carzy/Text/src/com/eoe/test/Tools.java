package com.eoe.test;

public class Tools {
		public static void swap(int [] aa,int a,int b){
			int c=aa[a];
			aa[b]=aa[a];
			aa[a]=c;
		}
		public static void swap(double []aa,int a,int b){
			double k=aa[a];
			aa[a]=aa[b];
			aa[b]=k;
			
		}
		public static void swap(char [] aa,int a,int b){
			char c=aa[a];
			aa[a]=aa[b];
			aa[b]=c;
		}
		public static void swap(String[] k,int a,int b){
			String c=k[a];
			k[a]=k[b];
			k[b]=c;
		}
		public static void swap(Number2 num2){
			int c=num2.a;
			num2.a=num2.b;
			num2.b=c;
		}
		public static class Number2{
			int a,b;
			public Number2() {
			}
			public Number2(int a, int b) {
				super();
				this.a = a;
				this.b = b;
			}
			@Override
			public String toString() {
				return "Number2 [a=" + a + ", b=" + b + "]";
			}
			
		}
		public static int add(int n){
			int result=0;
			for (int i = 1; i <= n; i++) {
				result+=i;
			}
			return result;
		}
		public static double fact(int n){
			double result=1;
			for (int i = 1; i <= n; i++) {
				result*=i;
			}
			return result;
		}
}

