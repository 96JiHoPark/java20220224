package temp.chap15.lecture;

import java.util.*;

public class Test {
	String result = "";
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list = Arrays.asList("a","b","c");
		System.out.println(list);
		
		
		Test t1 = new Test();
		
		list.forEach(e -> t1.result+=e);
		
		Map<Integer, Integer> map = new HashMap<>();
		
        Set<Integer> keySet = map.keySet(); 
	}
}
