package chap12.lecture.p01thread;

public class App12 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("스레드1");
			};
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("스레드2");
			};
		});

		t1.start();
		t2.start();
	}
}
