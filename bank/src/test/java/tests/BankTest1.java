package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BankAccount;

/**
* @author Ethan Dorenkamp - edorenkamp
* CIS175 - Spring 2021
* Feb 4, 2021
*/
public class BankTest1 {
	BankAccount account = new BankAccount();
	
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestSetBalance() {
		System.out.println("Inside TestofSetBalance()");
		account.setBalance(1000.0);
		assertEquals(1000, account.getBalance(), 0.0);
	}

	@Test
	public void TestSetBalance2() {
		System.out.println("Inside TestofSetBalance2()");
		account.setBalance(16343.73);
		assertEquals(16343.73, account.getBalance(), 0.0);
	}
}
