package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App09 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList();

		for (int i = 0; i < 10; i++) {
			list1.add(i);
		}
		System.out.println(list1);

		// 홀수 element 삭제

		// 방법 1.		list1.removeIf(e -> e%2 != 0);

		//방법 2.		int i = 0;
		//		while (i < list1.size()) {
		//			if(list1.get(i)%2==1) {
		//				list1.remove(i);
		//				continue;
		//			}
		//			i++;
		//		}
		
		//방법 3.
		Iterator<Integer> iter = list1.iterator();
		while(iter.hasNext()) {
			if(iter.next() % 2 == 1) {
				iter.remove();
			}
		}
		System.out.println(list1);

	}
}
