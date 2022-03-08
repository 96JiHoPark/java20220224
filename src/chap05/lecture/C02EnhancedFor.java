package chap05.lecture;

public class C02EnhancedFor {
	public static void main(String[] args) {
		int[] arr = { -1, 2, 10, 13 };

		int sum = 0;

		/*
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		*/

		for(int item : arr) {
			sum += item;
		}
		
		System.out.println(sum);
		
		boolean[] a = new boolean[1];
		System.out.println(a[0]);
		System.out.println(a[0]);
		
	}
}
