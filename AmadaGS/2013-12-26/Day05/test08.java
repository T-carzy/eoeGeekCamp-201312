package Day05;

import java.util.Scanner;

public class test08 {

	/**
	 * @param args�����ж�����5���������ȼ�
	 */
	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 //System.out.println("����������ƣ�");
		 int score;
		 do{
			 System.out.println("����������ƣ�");
			  score=scanner.nextInt();
			  
		 }while(score<0||score>5);
			 
		 String[] grades={ 
				"������","������","������",
				 "����","����","����"};
		 System.out.println(grades[score]);
		 
	}
}
