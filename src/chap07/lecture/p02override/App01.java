package chap07.lecture.p02override;

public class App01 {
	public static void main(String[] args) {
		QuantumComputer c1 = new QuantumComputer();
		
		// 메소드 재정의(method override)
		// 같은 이름(파라미터 타입, 순서 개수)의 메소드를
		// 하위 클래스에서 다시 정의하는 것
		
		c1.execute(); // QuantumComputer에 재정의된 메소드 실행
		c1.otherExecute();
		
		Computer c2 = new Computer();
		c2.execute(); // Computer 클래스의 메소드 실행
	
	}
	
}
