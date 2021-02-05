package model;

/**
* @author Ethan Dorenkamp - edorenkamp
* CIS175 - Spring 2021
* Feb 4, 2021
*/
public class BankAccount {

	private double Balance;
	private String accountHolder;
	
	public BankAccount() {
	}
	
	public BankAccount(double balance, String accountHolder) {
		this.Balance = balance;
		this.accountHolder = accountHolder;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void MakeWithdrawal(double amount) {
		setBalance(getBalance() - amount);
	}
	
	public void MakeDeposit(double amount) {
		setBalance(getBalance() + amount);
	}
	
	public boolean IsNegative() {
		if (getBalance() < 0) {
			return true;
		} else {
			return false;
		}
	}
}
