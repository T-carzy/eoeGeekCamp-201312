package com.eoe.test;

public class User {

		 String name;
		public int age;
		public double height;
		public String phone;
		public String QQ;
		public char sex;
		public String type;
		public User() {

		}
		public User(String name, int age, double height, String phone,
				String QQ, char sex, String type) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
			this.phone = phone;
			this.QQ=QQ;
			this.sex = sex;
			this.type = type;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + ", height=" + height
					+ ", phone=" + phone + ", QQ=" + QQ + ", sex=" + sex
					+ ", type=" + type + "]";
		}


}
