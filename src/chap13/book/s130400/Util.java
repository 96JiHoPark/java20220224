package chap13.book.s130400;

import chap13.book.s130200.Box;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.set(t);
		return box;
	}
}
