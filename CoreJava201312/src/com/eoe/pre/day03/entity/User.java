package com.eoe.pre.day03.entity;

//������
public class User {
	public int id;//���
	public String name;
	public String password;
	public String phone;
	public String email;
	//Object;//JDK��ĸ���
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + ", email=" + email;
	}

}
