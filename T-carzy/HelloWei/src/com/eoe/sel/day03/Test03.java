package com.eoe.sel.day03;

import java.util.ArrayList;

import com.eoe.pre.oop.day03.entity.Person1;
import com.eoe.pre.oop.day03.entity.Student;

public class Test03 {


	public static void main(String[] args) {
			ArrayList<Integer> src=new ArrayList<Integer>();
			src.add(100);
			src.add(200);
			src.add(300);
			src.add(400);
			ArrayList<Number> dest=new ArrayList<Number>();
			copy(src,dest);
			ArrayList<Student> stu=new ArrayList<Student>();
			stu.add(new Student("a", 'a', 2, 2.5, "aa", "aaa", "aaaa"));
			stu.add(new Student("b", 'a', 2, 2.4, "bb", "bbb", "bbbb"));
			stu.add(new Student("c", 'a', 2, 2.3, "cc", "ccc", "cccc"));
			stu.add(new Student("d", 'b', 2, 2.2, "dd", "ddd", "dddd"));
			stu.add(new Student("e", 'b', 2, 2.1, "ee", "eee", "eeee"));
			System.out.println();
			ArrayList<Person1> person=new ArrayList<Person1>();
			copy(stu,person);
	}
	public static <T> void copy(ArrayList<? extends T> src,ArrayList<T> dest){
		for (int i = 0; i <src.size(); i++) {
			dest.add(src.get(i));
		}
		for (T t : dest) {
			System.out.println(t);
		}
	}

}
