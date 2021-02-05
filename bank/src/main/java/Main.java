import java.util.Scanner;

import model.BankAccount;

/**
* @author Ethan Dorenkamp - edorenkamp
* CIS175 - Spring 2021
* Feb 4, 2021
*/
public class Main {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the name for the bank account holder:");
		String name = in.next();
		account.setAccountHolder(name);
		
		System.out.println("Please enter your initial balance:");
		double balance = in.nextDouble();
		account.setBalance(balance);
		
		System.out.println(account.getAccountHolder() + "  |  Account Balance: " + account.getBalance());
	}
}
