package chap13.lecture.p01generic;

import chap08.lecture.p01interface.example_class.Animal;
import chap08.lecture.p01interface.example_class.Chihuahua;

public class App06 {
	public static void main(String[] args) {
		Container6<String, Integer> o1 = new Container6<>();
		o1.setField1("java");
		o1.setFiled2(999);
		String s1 = o1.getField1();
		Integer i1 = o1.getFiled2();
		
		Container6<Animal, Number> o2 = new Container6<>();
		o2.setField1(new Chihuahua());
		o2.setFiled2(3.14);
		Animal a = o2.getField1();
		Number n = o2.getFiled2();
		
		
	}
}

class Container6<T, U>{
	private T field1;
	private U filed2;
	
	public T getField1() {
		return field1;
	}
	public void setField1(T field1) {
		this.field1 = field1;
	}
	
	public U getFiled2() {
		return filed2;
	}
	public void setFiled2(U filed2) {
		this.filed2 = filed2;
	}
}
