package chap03.lecture.method;

public class C04Method {
	public static void main(String[] args) {
//		myMethod1(3); //x
//		myMethod1(); // x
		myMethod1(3,5);
		myMethod1(33,55);
		myMethod1('가',33);
		
		myMethod2(999,888);
	}

	public static void myMethod1(int i, int j) {
		System.out.println(i + ", " + j);
	}
	
	// 파라미터명 : lowerCamelCase
	public static void myMethod2(int i, int j) {
		System.out.println(i*2);
		System.out.println(j*2);
	}
}
