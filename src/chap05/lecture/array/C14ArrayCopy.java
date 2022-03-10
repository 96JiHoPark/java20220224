package chap05.lecture.array;

import java.util.Arrays;

public class C14ArrayCopy {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] b = a;

		b[0][0] = 99;
		System.out.println(a[0][0]);

		int[][] c = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			c[i] = Arrays.copyOf(a[i], a[i].length);
		}

		c[0][0] = 999;
		System.out.println(a[0][0]); // 99
	}
}
