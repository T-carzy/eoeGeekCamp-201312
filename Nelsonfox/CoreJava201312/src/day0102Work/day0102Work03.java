package day0102Work;

import java.util.Arrays;

public class day0102Work03 {

	public day0102Work03() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 删除数组中重复的元素。(简介选择排序) {5,10,5,8,6,8}
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 5, 10, 5, 8, 6, 10, 21, 32 };
		System.out.println((Arrays.toString(a)));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a = delete(a, j);
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static int[] delete(int[] b, int j) {
		for (int k = j; k < b.length - 1; k++) {
			b[k] = b[k + 1];
		}
		b = Arrays.copyOf(b, b.length - 1);
		return b;
	}
}
