package com.eoe.oop.day01;

public class User {
	public int id;//±àºÅ
	public String name;
	public String password;
	public String phone;
	public String email;
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param password
	 * @param phone
	 * @param email
	 */
	public User(int id, String name, String password, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}
	
	
}
