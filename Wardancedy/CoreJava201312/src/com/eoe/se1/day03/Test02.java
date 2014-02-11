
package com.eoe.se1.day03;

import com.eoe.se1.day03.entity.NodeString;
/**
 * 课堂练习：
 * 创建NodeChar类，成员变量value的值是char
 * @author yw
 *
 */
public class Test02 {
	public static void main(String[] args) {
		//在堆中创建第一个节点对象
		NodeString link=new NodeString();
		//root记住链表的头一个节点地址
		NodeString root=link;
		link.value="aa";
		//在堆中创建第二个节点对象，地址保存在link.next
		link.next=new NodeString();
		link=link.next;
		link.value="bb";
		//在堆中创建第三个节点对象，地址保存在link.next
		link.next=new NodeString();
		//link记住第三个对象地址
		link=link.next;
//		link.next=root;
		link.value="cc";
		link=root;//link记住第一个节点的地址
		while(link!=null){
			System.out.println(link.value);
			link=link.next;
		}
	}
}
