package chap11.lecture.p01object;

public class App05Equals {
	public static void main(String[] args) {
		Car car1 = new Car("kia", "k5");
		Car car2 = new Car("kia", "k5");
		//true : 만약 Car의 company와 model이 같으면
		System.out.println(car1.equals(car2));
	}
}

class Car {
	private String company;
	private String model;

	public Car(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public boolean equals(Object o1) {
		if(o1 instanceof Car) {
			Car car = (Car)o1;
			if( (car.company == this.company) && (car.model ==this.model) ) {
				return true;
			}
		}
		return false;
	}
}
