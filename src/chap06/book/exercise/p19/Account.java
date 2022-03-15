package chap06.book.exercise.p19;

public class Account {
	private int balance;

	public void setBalance(int balance) {
		if (balance > 0 && balance < 1000000) {
			this.balance = balance;
		}
	}

	public int getBalance() {
		return this.balance;
	}
}
