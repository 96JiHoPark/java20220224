package chap08.book.s080302;

import chap08.book.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			// {} 안에 모든 추상 메소드의 실체 메소드를 작성해야 한다.
			@Override
			public void turnOn() {/*실행문*/}
			@Override
			public void turnOff() {/*실행문*/}
			@Override
			public void setVolume(int volume) { /*실행문 */}
		};
	}
}
