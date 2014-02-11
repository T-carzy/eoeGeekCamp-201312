package com.eoe.oop.day02;

import com.eoe.oop.day02.entity.Person;
import com.eoe.oop.day02.entity.Student;
import com.eoe.oop.day02.entity.Teacher;

public class Test02_2 {
	/**
	 * instanceOf示例
	 */
	public static void main(String[] args) {
		//以下三个命令将会出现类型转换异常
		Person person=new Teacher();
		Student stu=(Student) person;		
		Person person2=new Student();
		//用instanceOf关键字在类型转换时进行类型判断
		if(person instanceof Student){
			Student student=(Student) person;
			System.out.println("person引用的对象是Student类型");
		}else{
			System.out.println("person引用的对象不是Student类型");
		}
	}
}
