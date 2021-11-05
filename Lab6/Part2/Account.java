public class Account {
	// package protected
	String accountNumber;
	float balance;

	public Account(String xaccountNumber, float xbalance) {
		accountNumber = xaccountNumber;
		balance = xbalance;
	}

	public float getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void decrease(float amount) {
		balance -= amount;
		System.out.println("--- account no: " + accountNumber + " " + "decrease amount: " + amount);
	}

	public void increase(float amount) {
		balance += amount;
		System.out.println("--- account no: " + accountNumber + " " + "increase amount: " + amount);
	}

} // Account