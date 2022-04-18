package chap09.lecture.p02anonymous;

public class App05 {
	public static void main(String[] args) {
		
		MyAbstractClass1 o1 = new MyAbstractClass1() {
			
			@Override
			public void method1() {
				System.out.println("public method");
			}
			
			@Override
			public void method2() {
				System.out.println("protected method");
			}
			
			@Override
			public void method3() {
				System.out.println("package private method");
			}
		};
	
		o1.method1();
		o1.method2();
		o1.method3();
		
	}
}
