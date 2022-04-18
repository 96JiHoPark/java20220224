package chap10.lecture.p06custom;

public class ValueOutOfBoundsException extends Exception {
	ValueOutOfBoundsException(){
		
	}
	
	ValueOutOfBoundsException(String message){
		super(message);
	}
}
