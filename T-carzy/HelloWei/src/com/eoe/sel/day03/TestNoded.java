package com.eoe.sel.day03;

public class TestNoded {

	public static void main(String[] args) {
			Noded<String,Integer> link=new Noded<>();
			Noded<String, Integer> root=link;
			link.value1="梁文峰";
			link.value2=250;
			link.next=new Noded<String, Integer>();
			link=link.next;
			link.value1="wc";
			link.value2=222;
			link.next=new Noded<String, Integer>();
			link=link.next;
			link.value1="啊哈";
			link.value2=111;
			link=root;
			while(link!=null){
				System.out.println(link.value1);
				System.out.println(link.value2);
				link=link.next;
			}
			
	}

}
