package se1.day04;

import java.util.ArrayList;
import java.util.HashSet;

public class Test04 {
public static void main(String[] args) {
	//ArrayList<Integer> scores=new ArrayList<>();
		HashSet<Integer> scores = new HashSet<>();
	scores.add(100);
	scores.add(90);
	scores.add(95);
	
	//ArrayList<Integer> scores2=(ArrayList<Integer>) scores.clone();
	//ArrayList<Integer> scores2=new ArrayList<Integer>(scores);
	HashSet<Integer> scores2=new HashSet<>(scores);
	System.out.println("scores��scores2ָ�����ͬһ���϶���:"+(scores==scores2));
	System.out.println("scores.get(0)��scores2.get(0)ָ��ͬһ����:"+scores.equals(scores2));
}
}
