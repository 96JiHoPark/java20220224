package chap04.book;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		// for문의 루프 카운트 변수를 선언할 때 부동소수점 타입을 사용하면 안 된다.
		
		// 0.1은 float 타입으로 정확하게 표현할 수 없기 때문에 x에 더해지는 실제 값은 0.1보다 약간 크다.
		// 결국 루프는 9번만 실행된다.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
		
	}
}
