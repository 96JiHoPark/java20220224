package chap06.lecture.p04method;

public class Calculator2 {
	//varags(가변길이 매개변수)
	int sum(int... nums) {
		System.out.println("nums의 길이: " + nums.length);

		int sum = 0;
		for (int num : nums) {
			sum += num;
		}

		return sum;
	}

	void concat(String... strings) {
		String result = "";
		for (String s : strings) {
			result += s;
		}
		System.out.println(result);
	}
}
