package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App07 {
	public static void main(String[] args) {
		//ArrayList 만들고
		//0부터 99까지의 Integer를 element로 추가
		List<Integer> list1 = new ArrayList();
		for (int i = 0; i < 100; i++) {
			list1.add(i);
		}
		System.out.println(list1);

		//ArrayList 만들고
		//99부터 0까지의 Integer를 element로 추가
		List<Integer> list2 = new ArrayList();
		int z = 0;
		while (z < 100) {
			list2.add(z);
			z++;
		}
		System.out.println(list2);

		// 각 element를 2배의 값으로 변경
		list1.replaceAll(e -> e * 2);
		System.out.println(list1);
	}
}
