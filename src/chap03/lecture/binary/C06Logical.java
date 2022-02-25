package chap03.lecture.binary;

public class C06Logical {
	public static void main(String[] args) {
		// 논리 연산자
		// &&(AND short circuit), ||(OR short circuit)
		// &(AND), |(OR), ^(XOR)
		// 피연산자 : boolean
		// 연산결과 : boolean

		// && AND
		// 양변이 모두 true일 때만 true
		System.out.println("&& AND");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false

		// || OR
		// 양변이 모두 false일 때만 false
		System.out.println("|| OR");
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false

		// short circuit
		int i = 3;
		System.out.println((i > 0) && (i++ > 0));
		System.out.println(i); // 4
		// && 앞의 연산이 false이면 뒤의 연산은 하지 않고 다음 흐름으로 넘어감
		System.out.println((i < 0) && (i++ < 0));
		System.out.println(i); // 여전히 4

		System.out.println((i < 0) || (i++ < 0));
		System.out.println(i); // 5
		// || 앞의 연산이 true이면 뒤의 연산은 하지 않고 다음 흐름으로 넘어감
		System.out.println((i > 0) || (i++ > 0));
		System.out.println(i); // 여전히 5

		System.out.println((i > 0) & (i++ > 0)); // &, |, ^는 short circuit X
		System.out.println(i); // 6

		System.out.println((i < 0) & (i++ < 0));
		System.out.println(i); // 7

		// ^(XOR)
		// 양변이 다를 때 true, 다르면 false
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false
	}
}
