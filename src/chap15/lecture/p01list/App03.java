package chap15.lecture.p01list;

import java.util.List;
import java.util.ArrayList;

public class App03 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);

		// 합, 평균
		int sum = 0;

		for (Integer e : list) {
			sum += e;
		}

		double avg = (double) sum / list.size();

		System.out.println(sum + " " + avg);
	}
}
