package com.eoe.se2.day01;

public class Code17 {
public static void main(String[] args) {
	MyThrea zhangfei=new MyThrea("张飞");
	MyThrea wangfei=new MyThrea("王菲");
	MyThrea liuyifei=new MyThrea("刘亦菲");
	zhangfei.setPriority(Thread.MAX_PRIORITY);//最大优先级
	wangfei.setPriority(Thread.NORM_PRIORITY);//一般优先级
	liuyifei.setPriority(Thread.MIN_PRIORITY);//最小优先级
	zhangfei.start();
	wangfei.start();
	liuyifei.start();
	}
static class MyThrea extends Thread{
	public MyThrea(String name) {
		setName(name);
	}
	@Override
	public void run() {
	for(int i=1;i<=10;i++){
		System.out.println(this.getName()+":"+i);
	}
	}
}
}
