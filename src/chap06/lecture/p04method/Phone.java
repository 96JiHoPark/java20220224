package chap06.lecture.p04method;

public class Phone {
	// method overloading : 이름이 같은 메소드를 여러 개 만듦 
	
	void call(String name) {
		System.out.println(name + "에게 전화 걺");
	}
	
	void call(int number) {
		System.out.println(number + "로 전화 걺");
	}
	
	void call(String name, int number) {
		System.out.println(name + ", " + number + "로 전화 걺");
	}
	
	// 이름(call), 그리고 파라미터의 타입과 순서, 갯수가 같은 메소드가 이미 존재하므로 X
//	int call(int number) {
//		return 0;
//	}
	
}
