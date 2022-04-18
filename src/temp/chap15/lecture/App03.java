package temp.chap15.lecture;

import java.util.HashMap;
import java.util.Map;

public class App03 {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();

		map.compute(3, (k, v) -> 100);
		System.out.println(map);

		map.compute(4, (k, v) -> {
			System.out.println(k);
			System.out.println(v);

			return 0;
		});
		System.out.println(map);

		Map<Integer, Integer> map2 = new HashMap<>();
		int[] nums = { 9, 8, 7, 7 };
		/*
		map.compute(9, (k, v) -> v == null ? 1 : v + 1);
		map.compute(8, (k, v) -> v == null ? 1 : v + 1);
		map.compute(7, (k, v) -> v == null ? 1 : v + 1);
		map.compute(7, (k, v) -> v == null ? 1 : v + 1);
		*/

		for (int num : nums) {
			map.compute(num, (k, v) -> v == null ? 1 : v + 1);
		}
		System.out.println(map);
		System.out.println(map);
	}
}
