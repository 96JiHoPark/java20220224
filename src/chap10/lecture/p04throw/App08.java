package chap10.lecture.p04throw;

import java.io.FileReader;

public class App08 {
	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		FileReader fr = new FileReader("");
		fr.read();
	}
}
