package com.eoe.basic.day04;

import java.util.Random;

public class Test11 {
	public static void main(String[] args) {
		// 创建随机对象，用于产生随机数
		Random random = new Random();
		for (int i = 1; i <= 10; i++) {
			//System.out.println(random.nextDouble());
			System.out.println(random.nextInt(101));
		}

	}
}
