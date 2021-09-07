package com.techbee;

public class AtmMachine {

	public static void main(String[] args) throws Exception {
		
		BankAccount account = new BankAccount();
		account.displayCustomerDetails();
		account.depositFunds(40.55);
		account.withDrawFunds(60);
	}

}
