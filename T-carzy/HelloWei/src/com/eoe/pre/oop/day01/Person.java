package com.eoe.pre.oop.day01;

public class Person {
		public String name;
		public char sex;
		public int age;
		public double height;
		public String type;
		public void say(){
			System.out.println("大家好，我是"+name+"," +
					"今年"+age+"岁，身高"+height+"米，" +
							"我是一名"+type+sex+"士");
		
		}
		public void feeling(String s1,String s2){
			System.out.println(s1);
			System.out.println(s2);
		}
		public static void main (String[] args){
			Person p1=new Person();
			p1.name="傻子";
			p1.age=22;
			p1.height=2.22;
			p1.sex='男';
			p1.type="傻了吧唧的";
			p1.say();
			p1.feeling("我掉水坑里了", "好爽啊  哈哈。。。");
			Person p2=new Person();
			p2.name="疯子";
			p2.sex='女';
			p2.age=11;
			p2.height=1.11;
			p2.type="疯疯癫癫的";
			p2.say();
			p2.feeling("我也掉水坑了", "正好洗澡了，呜呜呜。。。");
			
			
		}

}
