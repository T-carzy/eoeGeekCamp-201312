package com.eoe.se1.day03;

import com.eoe.se1.day03.entity.Node_;

public class Test05 {
	public static void main(String[] args) {
		//������һ���ڵ����
		Node_<String> link=new Node_<String>();
		link.value="aa";
		Node_<String> root=link;
		//�ڶ��д����ڶ����ڵ����
		link.add(new Node_<String>());
		//��linkָ��ڶ����ڵ����
		link=link.next();//link.next
		link.value="bb";
		//�ڶ��д����������ڵ�->link.next
		link.add(new Node_<String>());
		//linkָ��������ڵ�
		link=link.next();
		link.value="ccc";
		link=root;
		while(link!=null){
			System.out.println(link.value);
			link=link.next();
		}
	}
}
