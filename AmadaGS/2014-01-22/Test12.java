package com.eoe.sel2.day001;

public class Test12 {
	static boolean isPrime=true;
	static int i;
	public static void main(String[] args) {
		FindPrime findPrime=new FindPrime();
		findPrime.start();
	}
	static class FindPrime extends Thread{
		@Override
		public void run() {
			for ( i =2; i < 200; i++) {
				Thread testPrime=new IsPrime();
				testPrime.start();
				try {
					testPrime.join();
					if(isPrime){
						System.out.println(i);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	static class IsPrime extends Thread{
		@Override
		public void run() {
			isPrime=true;
			int k=(int) Math.sqrt(i);
			for(int j=2;j<k&&isPrime;j++){
				isPrime=i%j!=0;
			}
		}
	}
}
