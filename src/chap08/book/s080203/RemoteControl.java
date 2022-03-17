package chap08.book.s080203;

public interface RemoteControl {
	// 상수 필드
	// 상수 필드에 public, static, final 이 적혀있지 않더라도, 컴파일 과정에서 붙게 된다.
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
