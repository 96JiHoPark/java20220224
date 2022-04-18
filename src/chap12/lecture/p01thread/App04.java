package chap12.lecture.p01thread;

public class App04 {
	public static void main(String[] args) {
		System.out.println("스레드 실행중...");
		
		try {
			// sleep 실행을 millisecond 만큼 멈춤
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("스레드 실행 계속...");
	}
}
