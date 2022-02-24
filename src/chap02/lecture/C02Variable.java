package chap02.lecture;

public class C02Variable {
	public static void main(String[] args) {
		//변수의 사용 범위(scope) : 선언된 블럭{} 안
		
		boolean b=true;
		if(b) {
			int a =3;
			System.out.println(a); // 사용 가능
		}
		
//		System.out.println(a); // 사용 불가
	}
}
