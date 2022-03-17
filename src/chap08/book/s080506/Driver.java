package chap08.book.s080506;

public class Driver {
	public void drive(Vehicle vehicle) {
		// 만약 파라미터가 vehicle 인터페이스의 구현객체 Bus이면 Bus타입으로 강제 타입변환 
		if(vehicle instanceof Bus) { 
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
