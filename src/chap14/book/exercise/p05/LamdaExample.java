package chap14.book.exercise.p05;

import java.util.function.IntBinaryOperator;

public class LamdaExample {
	private static int[] scores = {10,50,3};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max = maxOrMin((a, b) -> Math.max(a, b));
		System.out.println(max);
		
		int min = maxOrMin((a,b) -> Math.min(a, b));
		System.out.println(min);
	}
}
