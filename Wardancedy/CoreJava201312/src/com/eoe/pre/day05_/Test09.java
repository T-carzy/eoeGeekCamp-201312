package com.eoe.pre.day05_;

public class Test09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names={"�ŷ�","����","�����"};
		String[] cards={"����3","����4","����5","����6",
				        "����7","����8","����9","����10",
				        "����J","����Q","����K","����A","����2"};
		for (int i = 0; i < cards.length; i++) {
			System.out.println(names[i%3]+":"+cards[i]);
		}
	}

}
