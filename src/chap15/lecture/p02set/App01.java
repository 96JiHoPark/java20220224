package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App01 {
	public static void main(String[] args) {
		// 구현클래스 : HashSet
		Set<String> set = new HashSet<>();
		
		// add : element 추가
		set.add("jimin");
		set.add("rm");
		set.add("v");
		set.add("suga");
		
		// size : 크기
		System.out.println(set.size());
		
		set.add("rm"); // 중복허용 x
		
		//탐색
		// 향상된 for
		for(String item : set) {
			// 순서 보장 안됨
			System.out.println(item);
		}
		
		//Iterator
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//remove
		set.remove("rm");
		System.out.println(set.size());
		set.remove("winter");
		System.out.println(set.size());
		
		// element 있는지?
		System.out.println(set.contains("rm"));
		System.out.println(set.contains("jin"));
	}
}
