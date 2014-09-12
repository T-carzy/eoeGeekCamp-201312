package com.eoe.se1.day02;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {

	public Arraylist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("张飞");
		names.add("王菲");
		names.add("刘亦菲");
		names.add(0,"咖啡");
		
		Scanner scanner=new Scanner(System.in);
//		int index=scanner.nextInt();
    String text=scanner.next();
        
      if(names.contains(text)){
      	System.out.println(text+"包含在集合中");
        }
//		for(int i=index;i<names.size()-1;i++){
//			names.set(i, "小红");
//		
//	}
//	System.out.println(names);
//		for(int i=index;i<names.size();i++){
//			String name=names.remove(i);
//			
//		}
//		System.out.println(names);
//        for(int i=0;i<names.size();i++){
//        	System.out.println(names.get(i));
//        }
//        System.out.println();
//        for(String name:names){
//        	System.out.println(name);
//        }
//        System.out.println(names);
//        names.clear();
//        if(names.isEmpty()){
//        	System.out.println("集合是空的");
//        }else{
//        	System.out.println(names);
//        }
    
	}

}
