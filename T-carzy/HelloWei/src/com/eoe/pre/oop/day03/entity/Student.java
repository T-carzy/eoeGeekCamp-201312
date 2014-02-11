package com.eoe.pre.oop.day03.entity;

public class Student extends Person1{
		private String inSchool;
		private String inClass;
		public String getInSchool(){
			return inSchool;
		}
		public void setInClass(String inClass){
			this.inSchool=inSchool;
		}
		public String getInClass(){
			return inClass;
		}
		public void setInSchool(String inSchool){
			this.inSchool=inSchool;
		}
		public void say(){
			super.say();
			System.out.println("我在"+inSchool+inClass+"学习");
		}
		public void doing(){
			System.out.println(this.name+"正在被老师打");
		}
		public Student(){
			inSchool="eoe极客工作坊";
			inClass="android1205班";
		}
		public Student(String name, char sex, int age, double height,
				String type,String inSchool,String inClass) {
			super(name, sex, age, height, type);
			this.inSchool=inSchool;
			this.inClass=inClass;
			// TODO Auto-generated constructor stub
		}
		public Student(String name, char sex, int age, double height,
				String type) {
			super(name, sex, age, height, type);
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age, double height, String type,
				char sex) {
			super(name, age, height, type, sex);
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age, double height, String type) {
			super(name, age, height, type);
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age, double height) {
			super(name, age, height);
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age) {
			super(name, age);
			// TODO Auto-generated constructor stub
		}
		public Student(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return this.name+" inSchool=" + inSchool + ", inClass=" + inClass
					;
		}
		
	
	

}
