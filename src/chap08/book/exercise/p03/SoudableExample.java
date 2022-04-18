package chap08.book.exercise.p03;

public class SoudableExample {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
	

	
	
}