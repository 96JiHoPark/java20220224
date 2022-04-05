package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App05 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("java");
		list1.add("sping");
		list1.add("jsp");
		list1.add("java");
		
		//길이
		int i1 = list1.size();
		System.out.println(i1);
		//비어있는지
		boolean b1 = list1.isEmpty();
		System.out.println(b1);
		//비우기
		list1.clear();
		System.out.println(list1);
	}
}
