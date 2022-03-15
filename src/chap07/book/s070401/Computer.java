package chap07.book.s070401;

public class Computer extends Calculator {
	
	// 메소드 오버라이드
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
