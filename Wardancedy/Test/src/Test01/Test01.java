package Test01;

import java.util.Arrays;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		int a[] = new int[5];
		Random random = new Random();
		for (int j = 0; j < a.length; j++) {
			a[j] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(a));
		for (int j = 1; j < a.length; j++) {
			if (a[0] < a[j]) {
				int c = a[0];
				a[0] = a[j];
				a[j] = c;
			}
		}
		for (int j = 1; j < a.length; j++) {
			if (a[1] < a[j]) {
				int c = a[1];
				a[1] = a[j];
				a[j] = c;
			}
		}
		for (int j = 2; j < a.length; j++) {
			if (a[2] < a[j]) {
				int c = a[2];
				a[2] = a[j];
				a[j] = c;
			}
		}
		for (int j = 3; j < a.length; j++) {
			if (a[3] < a[j]) {
				int c = a[3];
				a[3] = a[j];
				a[j] = c;
			}
			System.out.println(Arrays.toString(a));
		}
	}
}
