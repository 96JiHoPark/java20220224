package chap03.lecture.binary;

public class C01Arithmetic {
	public static void main(String[] args) {
		// 산술연산자
		// +, -, *, /, %

		// 피연산자 2개
		// 피연산자의 type 에 따라서 결과값의 타입이 정해짐

		int n1 = 3;
		int n2 = 50;

		System.out.println(n1 + n2); // 53
		System.out.println(n1 - n2); // -47
		System.out.println(n1 * n2); // 150
		System.out.println(n1 / n2); // 0
		System.out.println(n1 % n2); // 3

		double n3 = 3.14;
		double n4 = 9.1;

		System.out.println(n3 + n4); // 12.24
		System.out.println(n3 - n4); // -5.959999999999999
		System.out.println(n3 * n4); // 28.574
		System.out.println(n3 / n4); // 0.3450549450549451
		System.out.println(n3 % n4); // 3.14

		System.out.println(n3 + n1); // 정수와 실수 연산 후 산출되는 값은 실수
		System.out.println(n3 - n1);
		System.out.println(n3 * n1);
		System.out.println(n3 / n1);
		System.out.println(n3 % n1);
	}
}
