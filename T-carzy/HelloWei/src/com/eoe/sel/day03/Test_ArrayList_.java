package com.eoe.sel.day03;

import com.eoe.pre.oop.day01.User;

public class Test_ArrayList_ {


	public static void main(String[] args) {
			ArrayList_<User> users=new ArrayList_<User>();
			users.add(new User(110, "张飞", "123456", "13333333333", "zf@qq.com"));
			users.add(new User(111, "关羽", "123456", "13333333333", "gy@qq.com"));
			users.add(new User(112, "马超", "123456", "13333333333", "mc@qq.com"));
			users.add(new User(113, "赵云", "123456", "13333333333", "zy@qq.com"));
			users.add(new User(114, "黄忠", "123456", "13333333333", "hz@qq.com"));
			for (int i = 0; i <users.size(); i++) {
				System.out.println(users.get(i));
			}
	}

}
