package chap07.lecture.p01inheritance;

public class App01 {
	public static void main(String[] args) {
		Computer c = new Computer();
		c.cpu = "펜티엄";
		c.ram = "32g";
		c.ssd = "1tb";
		c.executeGame();

		QuantumComputer qc = new QuantumComputer();
		qc.cpu = "양자cpu";
		qc.ram = "1tb";
		qc.ssd = "32tb";
		qc.executeGame();
		qc.executeQuantum();
	}
}
