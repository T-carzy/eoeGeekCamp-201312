package com.eoe.pre.oop.day01;

public class Test06 {
	public static void main(String[] args) {
		String name="梁文峰";
		int age=25;
		char sex='男';
		double height=1.72;
		String type="开朗活泼";
		String inSchool="eoe极客训练营学院";
		String inClass="Android1205班";
		System.out.println("嗨，大家好！，我叫"+name+"，今年"+age+"岁，身高"+height+"米，我是一个"+type+sex+"士");
		System.out.println("我在"+inSchool+inClass+"学习");
		System.out.println("我给大家表演两个值互换的算法");
		int a=10;int b=100;
		System.out.println("a="+a+"   b="+b);
		a+=b;
		b=a-b;
		a-=b;
		System.out.println("变");
		System.out.println("a="+a+"  b="+b);
		System.out.println("我找到好工作啦！，月薪8k"+"哈哈、、、");
		//第二个学员
				name="韩伟";
				sex='男';
				age=22;
				height=1.69;
				type="豪放的";
				inSchool="eoe极客学院";
				inClass="Android1205班";
				System.out.println("嗨，大家好，我叫"+name+"，今年"
					+age+"岁，身高"+height+"米，我是一个"
					+type+sex+"士");
				System.out.println("我在"+inSchool+inClass+"学习");
				System.out.println("我给大家表演两个变量相交换的算法");
				a=100;
				b=1000;
				System.out.println("a="+a+"  b="+b);
				a+=b;
				b=a-b;
				a-=b;
				System.out.println("变");
				System.out.println("a="+a+"  b="+b);
				System.out.println("我找到对象啦！还是美女。"+"嘻嘻...");

	}

}
