package com.eoe.se1.day04;

import java.util.HashSet;

public class Test05 {
	public static void main(String[] args) {
		HashSet<Integer> primes=new HashSet<Integer>();
		for(int i=2;i<200;i++){
			primes.add(i);
		}
		int k=(int) Math.sqrt(199);
		for(int i=2;i<=k;i++){
			//将i的倍数从集合中删除
			for(int j=2,b=i*j;b<200;j++,b=i*j){
				if(primes.contains(b)){
					primes.remove(b);
				}
			}
		}
		for(Integer i:primes){
			System.out.println(i);
		}
	}
}
