package chap09.lecture.p02anonymous;

public class App07 {
	public static void main(String[] args) {
		int var1 = 7; // final, effectively final 이어야 함

		MyInterface1 o1 = new MyInterface1() {
			@Override
			public void method1() {
				System.out.println(var1);
			}
		};
		
		o1.method1();
	}
}
