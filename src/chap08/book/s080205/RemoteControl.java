package chap08.book.s080205;

public interface RemoteControl {
	// 상수 필드
	// 상수 필드에 public, static, final 이 적혀있지 않더라도, 컴파일 과정에서 붙게 된다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상 메소드
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// 디폴트 메소드
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지 교환합니다.");
	}

}
