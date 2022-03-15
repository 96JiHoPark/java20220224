package chap06.lecture.p04method;

public class Computer {
	// 메소드명(파라미터)
	void execute(String program) {
		System.out.println(program);
	}

	void update(String app) {
		System.out.println(app + "을 업데이트 합니다");
	}

	void add(int a, int b) {
		int sum = a + b;
		System.out.println("합: " + sum);
	}
}
