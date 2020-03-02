package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
	
		AccountHolder accountHolder = new AccountHolder("John", "James", "Doe", "123-45-6789", 100, 1000);
		accountHolder.setSavingAccountOpeningBalance(1000);
		accountHolder.setCheckingAccountOpeningBalance(100);
		System.out.println(accountHolder.toString());
		
	CheckingAccount checkingAccount = new CheckingAccount();
	checkingAccount.deposit(500);
	SavingsAccount savingsAccount = new SavingsAccount();
	savingsAccount.withdraw(800);
	System.out.println(checkingAccount.toString());
	System.out.println(savingsAccount.toString());
	    
	     AccountHolder accountHolder2 = new AccountHolder();
	     accountHolder2.setCheckingAccountOpeningBalance(200);
	     accountHolder2.setSavingAccountOpeningBalance(500);
	   
    CheckingAccount checkingAccount2 = new CheckingAccount();
    checkingAccount2.deposit(-500);
    SavingsAccount savingsAccount2 = new SavingsAccount();
    savingsAccount2.withdraw(600);
    System.out.println(accountHolder2.toString());
    
    
	   
	 
	     
	
	    
	
				
	}
}