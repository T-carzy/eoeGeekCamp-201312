package com.eoe.oop.day02;

import javax.swing.text.StringContent;

public class Person02 {

		public String name;
		public char sex;
		public int age;
		public double height;
		public String type;
		private Object obj;
		public void say() {
			System.out.println("我叫"+name+"我是一个"+sex+"女，我今年"+age+"岁了，我身高"+height+"，我是一个"+type+"人。");
		}
		public void feeling(String cause , String content) {
			System.out.println(cause);
			System.out.println(content);
		}
		public Person02(String name2) {
			// TODO Auto-generated constructor stub
			name="多多";
			sex='男';
			age=21;
			height=1.70;
			type="阳光的";
		}
	  
	   public void Person02(String name){
			this.name=name;
		}
		public Person02(String name,char sex){
			this(name);
			this.sex=sex;
		}
		public Person02(String name, char sex, int age, double height, String type) {
			super();
			this.name = name;
			this.sex = sex;
			this.age = age;
			this.height = height;
			this.type = type;
	}
		public boolean equals(Object obj) {
			if(obj==null){
				return false;
			}
			Person other=null;
//			instanceof：判断obj是不是在Person里
			if(obj instanceof Person){
				other=(Person) obj;
			}else{
				return false;
			}
			if(obj==this){
				return true;
			}
			return this.name.equals(other.name)&&this.sex==other.sex&&this.age==other.age&&this.height-other.height<0.001&&this.type==this.type;
		}
		public static void main(String[] args) {
			Person p=new Person("张飞",'女');
			p.say();
			//Person p2=new Person();
			//System.out.println(p2.count);
		}

}