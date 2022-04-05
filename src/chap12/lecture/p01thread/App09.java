package chap12.lecture.p01thread;

import java.util.concurrent.atomic.AtomicInteger;

public class App09 {
	static AtomicInteger shareVar = new AtomicInteger();
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				System.out.println("thread81 : " + shareVar);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					shareVar.incrementAndGet();
				}
				System.out.println("thread81 : " + shareVar);
			}
		};
		
		t1.start();
		t2.start();
	}
}
