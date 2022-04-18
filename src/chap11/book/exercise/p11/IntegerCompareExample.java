package chap11.book.exercise.p11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		// byte, short, int 타입으로 박싱된 값이 -128~127 이라면
		// 언박싱 없이 비교하더라도 참조값이 아닌 내부의 값을 비교한다.
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
	}
}
