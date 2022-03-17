package chap08.lecture.p01interface;

public class App01 {
	public static void main(String[] args) {
		System.out.println(MyInterface2.FIELD1);
		System.out.println(MyInterface2.FIELD2);

//		MyInterface2.field1 = 33; // x
//		MyInterface2.field2 = 99; // x
		
//		MyInterface2 o1 = new MyInterface2(); // 인터페이스로 객체(인스턴스)를 만들 수 없음
	}
}
