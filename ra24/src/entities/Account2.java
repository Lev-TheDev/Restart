package entities;

import exceptions.WithdrawException;

public class Account2 {

	private int number;
	private String holder;
	private double balance;
	private double withdrawLimit;
	
	public Account2() {
	}

	public Account2(int number, String holder, double balance, double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws WithdrawException {
		if (amount > this.withdrawLimit) {
			throw new WithdrawException("The amount exceeds withdraw limit!");
		}
		if (amount > this.balance) {
			throw new WithdrawException("Not enough balance!");
		}
		else {
			this.balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return "Account " + number 
				+ ", Holder: " + holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
	
}
