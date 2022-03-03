package chap04.book.exercise;

public class Exercise04 {
	public static void main(String[] args) {

		int a = 0, b = 0, sum = 0;

		while (sum != 5) {
			a = (int) (Math.random() * 6) + 1;
			b = (int) (Math.random() * 6) + 1;
			
			sum=a+b;
			
			System.out.println("(" + a + ", " + b + ")");
		}

	}
}
