package chap05.book;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 87 };
		
		int sum=0;
		for(int score : scores) {
			sum+=score;
		}
		
		System.out.println("합 : " + sum);
		
		double avg = sum/scores.length;
		System.out.println("평균 : " + avg);
	}
}
