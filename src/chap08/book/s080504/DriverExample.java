package chap08.book.s080504;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // 자동 형변환: Vehicle vehicle = bus;
		driver.drive(taxi); // 자동 형변환: Vehicle vehicle = taxi;
		
	}
}