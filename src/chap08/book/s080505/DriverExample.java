package chap08.book.s080505;

public class DriverExample {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		vehicle.run();
//		vehicle.checkFare(); // x
		
		Bus bus = (Bus)vehicle; // 강제 타입변환(Casting)
		bus.run();
		bus.checkFare();
	}
}
