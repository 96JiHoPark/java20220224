package chap08.lecture.p01interface.example_class;

public interface Pet {
	// 인터페이스명 : UpperCamelCase
	// interface 키워드 사용
	
	//public abstract void roll(); 와 같음
	void roll();
	
	default void sit() {
		System.out.println("반려동물이 앉습니다.");
	}
	
}
