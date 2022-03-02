package chap04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + " x " + n + " = " + (m * n));
			}
		}
		
		System.out.println("--------------------------------");
		
		// 9단 ~ 2단
		for (int i = 9; i >= 2; i--) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
		System.out.println("--------------------------------");
		
		// 9x9 부터 2x1 까지
		for(int i=9; i>=2; i--) {
			for(int j=9; j>=1; j--) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
	}
}
