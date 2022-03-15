package chap06.lecture.p04method;

public class App02 {
	
	public static void main(String[] args) {
		//worker 클래스의 인스턴스 2개 만들고
		//work() 메소드 실행
		
		Worker worker1 = new Worker("worker1");
		Worker worker2= new Worker("worker2");
		
		worker1.work();
		worker2.work();
	}
	
}
