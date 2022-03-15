package chap07.book.exercise.p05;

public class Child extends Parent{
	private int studentNo;

	public Child(String name, int studentNo) {
//		this.name=name;
		super(name);
		this.studentNo=studentNo;
	}
}
