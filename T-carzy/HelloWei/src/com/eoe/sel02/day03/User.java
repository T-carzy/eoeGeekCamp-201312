package com.eoe.sel02.day03;

import java.io.Serializable;

public class User implements Serializable{


			public int id;
			public String name;
			public String password;
			public String phone;
			public String email;
			public User() {
			
			}
			public User(int id, String name, String password, String phone,
					String email) {
				super();
				this.id = id;
				this.name = name;
				this.password = password;
				this.phone = phone;
				this.email = email;
			}
			@Override
			public String toString() {
				return "User [id=" + id + ", name=" + name + ", password="
						+ password + ", phone=" + phone + ", email=" + email
						+ "]";
			}
			
			

}

