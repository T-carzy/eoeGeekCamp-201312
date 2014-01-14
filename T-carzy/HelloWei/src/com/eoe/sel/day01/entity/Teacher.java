package com.eoe.sel.day01.entity;

public class Teacher extends Person1{
		private String inSchool;
		private String worker;
		public String getInSchool(){
			return inSchool;
		}
		public void setWorker(String worker){
			this.inSchool=inSchool;
		}
		public String getWorker(){
			return worker;
		}
		public void setInSchool(String inSchool){
			this.inSchool=inSchool;
		}
		public void say(){
			super.say();
			System.out.println("我在"+inSchool+"授课"+worker);
		}
		public void doing(){
			System.out.println(this.name+"现在正在打梁文峰");
		}
		public Teacher(){
			inSchool="eoe极客工作坊";
			worker="android1205班";
		}
		public Teacher(String name, char sex, int age, double height,
				String type,String inSchool,String worker) {
			super(name, sex, age, height, type);
			this.inSchool=inSchool;
			this.worker=worker;
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name, char sex, int age, double height,
				String type) {
			super(name, sex, age, height, type);
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name, int age, double height, String type,
				char sex) {
			super(name, age, height, type, sex);
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name, int age, double height, String type) {
			super(name, age, height, type);
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name, int age, double height) {
			super(name, age, height);
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name, int age) {
			super(name, age);
			// TODO Auto-generated constructor stub
		}
		public Teacher(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		
	
	

}
