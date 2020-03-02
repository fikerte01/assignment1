package com.meritamerica.assignment1;

public class CheckingAccount {
	private double openingBalance;
	private double balance;
	private double interestRate;
	private double amount;
	private boolean withdraw;
	private boolean deposit;
	
	
	
	public CheckingAccount() {
	}

	public CheckingAccount(double openingBalance) {
		super();
		this.openingBalance = openingBalance;
	}

	public double getOpeningBalance() {
		return openingBalance;
	}

	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public boolean isWithdraw() {
		return withdraw;
	}

	public void setWithdraw(boolean withdraw) {
		this.withdraw = withdraw;
	}

	public boolean isDeposit() {
		return deposit;
	}

	public void setDeposit(boolean deposit) {
		this.deposit = deposit;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean deposit(double d) {
		return false;
	}

	public boolean withdraw(double d) {
		return false;
	}

	public double futureValue(int i) {
		return 0;
	}
	
	
}