package chap03.lecture.binary;

public class C05Comparison {
	public static void main(String[] args) {
		// 비교연산자
		// >, >=, <, <=, ==, !=
		// 결과 type : boolean

		int i1 = 3, i2 = 5;

		System.out.println(i1 == i2); // 같으면 true
		System.out.println(i1 != i2); // 다르면 true
		System.out.println(i1 > i2); // 왼쪽의 값이 더 크면 true
		System.out.println(i1 >= i2); // 왼쪽의 값이 더 크거나, 같으면 true
		System.out.println(i1 < i2); // 오른쪽의 값이 더 크면 true
		System.out.println(i1 <= i2); // 오른쪽의 값이 더 크거나, 같으면 true

		System.out.println(3.14 <= 9.9);
		System.out.println('A' <= 'B'); // unicode 비교
//		System.out.println('A' + 0);

		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);

	}
}
