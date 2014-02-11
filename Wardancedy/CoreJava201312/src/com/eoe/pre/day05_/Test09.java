package com.eoe.pre.day05_;

public class Test09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] names={"ÕÅ·É","Íõ·Æ","ÁõÒà·Æ"};
		String[] cards={"ºìÌÒ3","ºìÌÒ4","ºìÌÒ5","ºìÌÒ6",
				        "ºìÌÒ7","ºìÌÒ8","ºìÌÒ9","ºìÌÒ10",
				        "ºìÌÒJ","ºìÌÒQ","ºìÌÒK","ºìÌÒA","ºìÌÒ2"};
		for (int i = 0; i < cards.length; i++) {
			System.out.println(names[i%3]+":"+cards[i]);
		}
	}

}
