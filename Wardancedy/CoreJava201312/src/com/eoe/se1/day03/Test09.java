package com.eoe.se1.day03;

import java.util.ArrayList;
import com.eoe.oop.day02.entity.Person;
import com.eoe.oop.day02.entity.Student;

public class Test09 {
	public static void main(String[] args) {
		ArrayList<Integer> src=new ArrayList<Integer>();
		src.add(100);
		src.add(150);
		src.add(180);
		
		ArrayList<Number> dest=new ArrayList<Number>();
		copy(src,dest);
		ArrayList<Student> students=new ArrayList<Student>();
		ArrayList<Person> people=new ArrayList<Person>();
		students.add(new Student("a", 'a', 22, 2, "aa", "aaa", "aaaa"));
		students.add(new Student("b", 'b', 22, 2, "bb", "bbb", "bbbb"));
		students.add(new Student("c", 'a', 22, 2, "cc", "ccc", "cccc"));
		System.out.println();
		copy(students,people);
	}
	public static <T> void copy(
		ArrayList<? extends T> src,
		ArrayList<T> dest){
		for(int i=0;i<src.size();i++){
			dest.add(src.get(i));
		}
		for(T t:dest){
			System.out.println(t);
		}
	}
}
