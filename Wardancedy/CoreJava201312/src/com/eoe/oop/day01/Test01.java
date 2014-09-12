package com.eoe.oop.day01;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person.main(null);
		//Person.say();
		Person p1=new Person();
//		p1.name="李伟";
//		p1.sex='男';
//		p1.age=22;
//		p1.height=1.8;
//		p1.type="豪放的";
		p1.say();
		p1.feeling("俺找到好工作啦", "哈哈...");
	}

}
