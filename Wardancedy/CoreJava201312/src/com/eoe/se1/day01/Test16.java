package com.eoe.se1.day01;

import java.util.Scanner;

import com.eoe.se1.day01.button.Button;
import com.eoe.se1.day01.button.OnClickListener;

public class Test16 {
	public static void main(String[] args) {
		//步骤1、创建两个按钮
		Button btnLogin=new Button();
		Button btnRegister=new Button();
		/*步骤2、将两个按钮点击事件响应的代码预存在两个
		 * 按钮的mOnClickListener属性中.
		 */
		btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("执行登陆操作");
			}
		});
		RegisterListener l=new RegisterListener();
		btnRegister.setOnClickListener(l);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-登陆");
		System.out.println("2-注册");
		int select=scanner.nextInt();
		switch (select) {
		case 1:
			btnLogin.performClick();
			break;
		case 2:
			btnRegister.performClick();
			break;
		}
	}
	static class RegisterListener implements OnClickListener{
		@Override
		public void onClick() {
			System.out.println("执行注册操作");
		}
		
	}
}
