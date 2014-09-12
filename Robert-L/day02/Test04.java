package com.eoe.se1.day02;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 第一步，创建两个按钮
		Button btnLogin = new Button();
		Button btnRegister = new Button();
		/*
		 * 第二步，将两个按钮点击事件响应的代码预存在两个按钮的mOnClickListener属性中
		 */

		btnLogin.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("执行登陆操作");
			}
		});

		RegisterListener l = new RegisterListener();
		btnRegister.setOnClickListener(l);
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-登陆");
		System.out.println("2-注册");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			btnLogin.performClick();
			break;

		case 2:
			btnRegister.performClick();
			break;
		}

	}

	static class RegisterListener implements OnClickListener {

		@Override
		public void onClick() {
			System.out.println("执行注册操作");
		}

	}
}
