package com.eoe.pre.oop.day01;

public class Student01 {

	
	public static void main(String[] args) {
			String name="某某";
			int age=23;
			double height=17.1;
			char sex='男';
			String type="抽象的";
			String inSchool="eoe极客学院";
			String inClass="Android1205班";
			System.out.println("嗨，大家好，我是"+name+"，" +
					"今年"+age+"岁，身高"+height+"米，我是一个"
					+type+sex+"士，" +"我在"+inSchool+
					inClass+"学习");
			System.out.println("下面我给大家表演下良个变量相互交换的算法");
			int a=1111;
			int b=9999;
			System.out.println("a="+a+"b="+b);
			a+=b;
			b=a-b;
			a-=b;
			System.out.println("a"+a+"b"+b);
			System.out.println("我找到了好工作，月薪8K"+"哈哈。。。。。。");
			name="XX";
			age=21;
			sex='女';
			height=1.56;
			type="温柔的";
			inSchool="极客工作坊";
			inClass="Android1205班";
			System.out.println("嗨，大家好，我是"+name+"，" +
					"今年"+age+"岁，身高"+height+"米，我是一个"
					+type+sex+"士，" +"我在"+inSchool+
					inClass+"学习");
			System.out.println("下面我给大家表演下良个变量相互交换的算法");
			a=11111;
			b=99999;
			System.out.println("a="+a+"b="+b);
			a+=b;
			b=a-b;
			a-=b;
			System.out.println("a"+a+"b"+b);
			System.out.println("我丢了五百万"+"哈哈哈。。。。");
	}

}
