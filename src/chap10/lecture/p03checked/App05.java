package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App05 {
	public static void main(String[] args) {

		// 하나의 try블럭 사용
		// 하나이상의 catch 블럭 사용
		// 컴파일 오류 해결

		try {
			FileReader fr = new FileReader("");
			fr.read();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 발생");
		} catch (IOException e) {
			System.out.println("IOException 발생");
		}

	}
}
