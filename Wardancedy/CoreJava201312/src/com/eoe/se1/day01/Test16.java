package com.eoe.se1.day01;

import java.util.Scanner;

import com.eoe.se1.day01.button.Button;
import com.eoe.se1.day01.button.OnClickListener;

public class Test16 {
	public static void main(String[] args) {
		//����1������������ť
		Button btnLogin=new Button();
		Button btnRegister=new Button();
		/*����2����������ť����¼���Ӧ�Ĵ���Ԥ��������
		 * ��ť��mOnClickListener������.
		 */
		btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("ִ�е�½����");
			}
		});
		RegisterListener l=new RegisterListener();
		btnRegister.setOnClickListener(l);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-��½");
		System.out.println("2-ע��");
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
			System.out.println("ִ��ע�����");
		}
		
	}
}
