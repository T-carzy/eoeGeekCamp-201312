package com.eoe.sel.day04;

import java.util.Collection;
import java.util.HashSet;

public class Test07 {
	public static void main(String[] args) {
			Collection<String> collect;
			collect=new HashSet<String>();
			collect.add("a");
			collect.add("b");
			collect.add("c");
			collect.add("d");
			for (String s : collect) {
				System.out.println(s);
			}
			if(collect.contains("c")){
				System.out.println("c在集合里");
			}else{
				System.out.println("c不在集合里");
			}
}
}
