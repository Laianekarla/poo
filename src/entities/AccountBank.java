package entities;

public class AccountBank {

	private int accountNumber;
	private String name;
	private double depositInitial;

	public AccountBank() {

	}

	public AccountBank(int accountNumber, String name, double depositInitial) {
		this.accountNumber = accountNumber;
		this.name = name;
		depositValue(depositInitial);
	}

	public AccountBank(int accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public void SetName(String name) {
		this.name = name;
	}

	public double getDepositInitial() {
		return depositInitial;
	}

	// metodos

	// aumentar valor por deposito
	public void depositValue(double amount) {
		depositInitial += amount;
	}

	public void withdrawValue(double amount) {
		depositInitial -= amount + 5.0;
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ "
				+ String.format("%.2f", depositInitial);
	}

}
