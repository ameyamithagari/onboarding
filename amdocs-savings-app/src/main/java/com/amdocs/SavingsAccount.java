package com.amdocs;

public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("Assume balance is retrived from database");
		return 7000.00;
	}

	public double withdraw(double ammountToBeWithdrawn) throws InsufficientBalanceException  {
		// TODO Auto-generated method stub
		System.out.println("inside withdraw method");
		
		double currentBalance= getBalance();
		
		if (ammountToBeWithdrawn< currentBalance)
			currentBalance =currentBalance -ammountToBeWithdrawn;
		else 
			throw new InsufficientBalanceException();
		
		updateBalanaceIntoDB(currentBalance);
		return currentBalance;
	}

	void updateBalanaceIntoDB(double currentBalance) {
		// TODO Auto-generated method stub
		System.out.println("assume here balance is updated in the database");
		
	}
	

}
