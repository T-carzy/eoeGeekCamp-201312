package Day05;

import java.util.Random;

public class test12 {

	/**
	 * @param args����
	 */
	public static void main(String[] args) {
	/*String[] cards={"����2","����3","����4",
			        "����5","����6","����7",
			        "����8","����9","����10",
			        "����J","����Q","����K","����A"};
	 String[] player={"�ŷ�","����","�����"};
	 for(int i=0;i<cards.length;i++){
		 System.out.println(player[i%2]+":"+cards[i]);
	 }*/
		String[] cards={"����2","����3","����4",
		                "����5","����6","����7",
		                "����8","����9","����10",
		                "����J","����Q","����K",
		                "����A","����0","����w"};
		String[] player={"�ŷ�","����","�����"};
		
		Random random=new Random();
		for(int i=cards.length-1;i>0;i--){
			int j=random.nextInt(i);
			
			String temp=cards[i];
			       cards[i]=cards[j];
			       cards[j]=temp;
			       System.out.println(player[i%3]+":"+cards[i]);
		}
		System.out.println(player[0]+":"+cards[0]);
		
		
		
		
		
		
		
	}

}
