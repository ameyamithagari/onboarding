package com.amdocs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class SavingsAccountTest {
	
	private SavingsAccount account;
	private SavingsAccount accountSpy;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		account = new SavingsAccount();
		
		//partial mocking
	 accountSpy =spy(account);
	}

	@After
	public void tearDown() throws Exception {
		account= null;
		accountSpy =null;
		}

	@Test
	public void testWithdrawWhenCurrentBalanceIs5000INR() throws InsufficientBalanceException {
		doReturn(5000.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanaceIntoDB(anyDouble());
		double updatedBalance = accountSpy.withdraw(1000.00);
		
		double expectedBalance =4000;
		
		assertEquals(expectedBalance, updatedBalance, 0.0001);
		//verify
				verify(accountSpy ,times(1)).getBalance();
				verify(accountSpy ,times(1)).updateBalanaceIntoDB(anyDouble());
			
		
		
	}
	@Ignore
	@Test
	public void testWithdrawWhenCurrentBalanceIsLessThanWithdrawAmmount() {
		boolean exceptionthrown=false;
		doReturn(500.00).when(accountSpy).getBalance();
		doNothing().when(accountSpy).updateBalanaceIntoDB(anyDouble());
		try {
		accountSpy.withdraw(1000.00);
		}
		catch (InsufficientBalanceException e) {
			// TODO: handle exception
			exceptionthrown=true;
			
		}
		boolean expectedResponse=true;
		//double expectedBalance =500;
		
		assertEquals(expectedResponse, exceptionthrown);
		//verify
				verify(accountSpy ,times(1)).getBalance();
				//verify(accountSpy ,times(0)).updateBalanaceIntoDB(anyDouble());
			
		
		
		
	}

}
