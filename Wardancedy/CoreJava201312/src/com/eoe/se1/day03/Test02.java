
package com.eoe.se1.day03;

import com.eoe.se1.day03.entity.NodeString;
/**
 * ������ϰ��
 * ����NodeChar�࣬��Ա����value��ֵ��char
 * @author yw
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//�ڶ��д�����һ���ڵ����
		NodeString link=new NodeString();
		//root��ס�����ͷһ���ڵ��ַ
		NodeString root=link;
		link.value="aa";
		//�ڶ��д����ڶ����ڵ���󣬵�ַ������link.next
		link.next=new NodeString();
		link=link.next;
		link.value="bb";
		//�ڶ��д����������ڵ���󣬵�ַ������link.next
		link.next=new NodeString();
		//link��ס�����������ַ
		link=link.next;
//		link.next=root;
		link.value="cc";
		link=root;//link��ס��һ���ڵ�ĵ�ַ
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
	}
}
