package chap07.lecture.p03protected;

import chap07.lecture.p03protected.package2.SubClass1;
import chap07.lecture.p03protected.package1.OtherClass;
public class App01 {
	public static void main(String[] args) {
		// public : 모두 접근가능
		// protected : 다른 패키지에 있어도 상속 받으면 접근 가능
		// default : 같은 패키지 내에서만 접근가능
		// private : 클래스 내에섬나 접근가능
		SubClass1 c1 = new SubClass1();
		c1.subMethod(); 
		
		System.out.println();
		
		OtherClass c2 = new OtherClass();
		c2.someMethod();
	}
}
