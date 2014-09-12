package com.eoe.se1.day04;

import java.awt.List;
import java.util.ArrayList;
import java.util.ListIterator;

import com.eoe.se1.day02.Arraylist;

public class Code06 {
public static void main(String[] args) {
java.util.List<Integer> list=new ArrayList<Integer>();
list.add(100);
list.add(90);
list.add(80);
list.add(95);
ListIterator<Integer> iterator=list.listIterator();
while(iterator.hasNext()){
	System.out.println(iterator.next()+" ");
	
}
System.out.println();
while(iterator.hasPrevious());
System.out.println(iterator.previous()+" ");
}
}
