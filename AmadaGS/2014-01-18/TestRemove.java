package com.eoe.weekday.Test;

import com.eoe.weekday.entity.ArrayList_;

public class TestRemove {
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
		//实现移除功能
		names.remove(2);
		for(int i=0;i<names.size();i++){
			System.out.print(names.get(i)+"  ");
		}
		//实现判断是否包含某元素
		System.out.println();
		System.out.println(names.contains("高珊"));
		System.out.println(names.contains("刘珊"));
	}

}
