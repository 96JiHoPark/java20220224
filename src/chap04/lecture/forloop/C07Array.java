package chap04.lecture.forloop;

public class C07Array {
	public static void main(String[] args) {

		int[] arr1 = new int[6];

		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		arr1[5] = 6;

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] *= 2;
			System.out.println(arr1[i]);
		}
	}
}
