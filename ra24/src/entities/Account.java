package entities;

public class Account {
	
	private int number;
	private String holder;
	private double balance;
	
	public static final double TAX = 5.00;
	
	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		addValue(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}
	
	public void addValue(double value) {
		this.balance += value;
	}
	
	public void withdrawValue(double value) {
		this.balance -= value + TAX;
	}
	
	@Override
	public String toString() {
		return "Account " + number 
				+ ", Holder: " + holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
