package chap13.book.s130400;

import chap13.book.s130200.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.<String>boxing("홍길동");
		String strValue = box2.get();
		
		System.out.println(intValue);
		System.out.println(strValue);
	}
}
