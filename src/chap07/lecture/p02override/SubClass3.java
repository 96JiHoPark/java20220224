package chap07.lecture.p02override;

public class SubClass3 extends SuperClass3 {
	public void subMethod1() {
		System.out.println("서브 메소드1");
		super.superMethod1();
		System.out.println("서브 메소드2");
		super.superMethod2();
//		super.superMethod3(); // private 멤버 접근불가
	}
}
