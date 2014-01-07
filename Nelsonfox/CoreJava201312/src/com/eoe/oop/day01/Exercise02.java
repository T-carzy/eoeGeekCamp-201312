package com.eoe.oop.day01;

public class Exercise02 {

	public Exercise02() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 请用面向对象的编程方式 定义Teacher类，然后编写 Exercise01_2类，调用 Teacher类创建两个老师对象。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Teacher teacher=new Teacher();
		Teacher teacher2 = new Teacher();
		// teacher.name="王菲";
		// teacher.age=22;
		// teacher.height=1.89;
		// teacher.sex='女';
		// teacher.type="温柔的";
		// teacher.zhiyeString="教师";
		Teacher teacher = new Teacher("王菲", '女', 22, 1.89, "温柔的", "教师");
		teacher.say();

		teacher2.name = "小红";
		teacher2.age = 24;
		teacher2.height = 1.72;
		teacher2.sex = '女';
		teacher2.type = "温柔的";
		teacher2.zhiyeString = "讲师";
		teacher2.say();
	}

}
