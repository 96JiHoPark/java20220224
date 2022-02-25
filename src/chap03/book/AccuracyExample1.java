package chap03.book;

public class AccuracyExample1 {
	public static void main(String[] args) {
		// 부동소수점 타입(float, double)을 사용하는 경우
		// 0.3이 정확히 나오지 않고 근사치가 나온다.
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;

		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한 개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이 남는다");
		
		
		
		
	}
}
