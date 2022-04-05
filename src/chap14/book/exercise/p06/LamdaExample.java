package chap14.book.exercise.p06;

import java.util.function.ToIntFunction;

public class LamdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};

	//avg() 메소드 작성
	static double avg(ToIntFunction<Student> f) {
		double avg = 0.0;
		for (Student s : students) {
			avg += f.applyAsInt(s);
		}
		avg /= students.length;

		return avg;
	}
	//

	public static void main(String[] args) {
		double englishAvg = avg((Student s) -> {
			return s.getEng();
		});
		System.out.println(englishAvg);

		double mathAvg = avg(s -> s.getMath());
		System.out.println(mathAvg);

	}
}
