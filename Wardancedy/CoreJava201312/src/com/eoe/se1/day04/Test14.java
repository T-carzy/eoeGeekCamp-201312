package com.eoe.se1.day04;

import com.eoe.se1.day04.entity.Stack_;

public class Test14 {
	public static void main(String[] args) {
		Stack_<String> stack=new Stack_<String>();
		stack.push("�ŷ�");
		stack.push("����");
		stack.push("�����");
		for(String name:stack){
			System.out.println(name);
		}
		//��ջ
//		String name=stack.pop();
//		System.out.println(name);
//		System.out.println("********************");
//		for(int i=0;i<stack.size();i++){
//			System.out.println(stack.get(i));
//		}
		
	}
}
