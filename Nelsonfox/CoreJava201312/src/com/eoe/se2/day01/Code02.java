package com.eoe.se2.day01;

public class Code02 {
public static void main(String[] args) {
	new Thread(){
		public void run(){
			for(int i=1;i<=10;i++){
				System.out.println("worker thread:"+i);
				try{
					Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	};
	}.start();
	for(int i=1;i<=10;i++){
		System.out.println(Thread.currentThread().getName()+":"+i);
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}

}
