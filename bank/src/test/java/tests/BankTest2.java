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
public class BankTest2 {
	BankAccount account = new BankAccount();
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void TestMakeWithdrawal() {
		System.out.println("Inside TestOfMakeWithdrawal()");
		account.setBalance(1250.0);
		account.MakeWithdrawal(320.0);
		assertEquals(930, account.getBalance(), 0.0);
	}
	
	@Test
	public void TestIsNegative() {
		System.out.println("Inside TestOfIsNegative()");
		account.setBalance(260.5);
		account.MakeWithdrawal(549.47);
		assertTrue(account.IsNegative());
	}
	
	@Test
	public void TestIsNegative2() {
		System.out.println("Inside TestOfIsNegative2()");
		account.MakeDeposit(447.23);
		assertFalse(account.IsNegative());
	}
}
