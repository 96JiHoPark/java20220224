package chap14.lecture.p01lambda;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class App09 {
	public static void main(String[] args) {
		
	}
	
}

class MyArrayList{
	private String[] values = {"java","spring","jsp","hello","sunday"};
	
	public void forEach(Consumer<String> action) {
		for(String v : values) {
			action.accept(v);
		}
	}
	
	public void replaceAll(UnaryOperator<String> op) {
		for(int i=0; i<values.length; i++) {
			values[i] = op.apply(values[i]);
		}
	}
}
