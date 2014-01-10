package com.eoe.Oop.exercise;

public class Exercise01_1 {

	/**
	 * @param args//用非面向对象的方式创建并显示了两个老师的相关信息
	 */
	public static void main(String[] args) {
		//显示第一个老师信息
		String name="王刚";
		char sex='男';
		int age=43;
		double height=1.78;
		String dep="计算机学院";
		String course="java";
		System.out.println("我是你们的"+name+"老师，今年"
		+age+"性别"+sex+"我在"+dep+"教"+course);
		System.out.println("今年我们班考试得了第一名");
		System.out.println("我很开心！");
		System.out.println("现在我教大家交换数据");
		int a=10,b=90;
		System.out.println("a="+a+" b="+b);
		a+=b;
		b=a-b;
		a-=b;
		System.out.println("a="+a+" b="+b);
		//第二个老师的信息
		String name1="李丽";
		char sex1='女';
		int age1=28;
		double height1=1.76;
		String dep1="英语学院";
		String course1="英语";
		System.out.println("我是你们的"+name1+"老师，今年"
				+age1+"性别"+sex1+"我在"+dep1+"教"+course1);
		System.out.println("今年我们班纪律最差");
		System.out.println("我很不高兴！");
		System.out.println("现在我教大家交换数据");
		int i=45,j1=78;
		System.out.println("i="+i+" j="+j1);
		i+=j1;
		j1=i-j1;
		i-=j1;
		System.out.println("i="+i+" j="+j1);
	}

}
