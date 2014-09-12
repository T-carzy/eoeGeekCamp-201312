package com.eoe.weekday.Test;

import com.eoe.weekday.entity.ArrayList_;

public class TestSet {
	public static void main(String[] args) {
		ArrayList_<String> names=new ArrayList_<String>();
		names.add("高珊");
		names.add("王小莉");
		names.add("李刚");
		names.add("刘阳");
		names.add("赵红");
		for(int i=0;i<names.size();i++){
			System.out.print(names.get(i)+"  ");
		}
		System.out.println();
		System.out.println("修改后的元素：");
		//实现修改元素内容
		names.set(2, "王力宏");
		names.set(1,"马云");
		//实现foreach功能
		for(String n:names){
			System.out.print(n+" ");
		}
		
		

	}

}
