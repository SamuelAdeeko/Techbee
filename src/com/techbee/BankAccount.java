package com.techbee;

public class BankAccount {

	int accountNumber = 123456789;
	double balance = 50.0;
	String customerName = "Adekoya";
	String email = "adekoya@yahoo.com";
	long phoneNumber = 5105630847l;
	
	
	public double depositFunds(double amount) {
		double currentBalance = this.balance + amount;
		System.out.println(currentBalance);
		return currentBalance;
	}
	
	public double withDrawFunds(double amount) throws Exception {
		if(this.balance >= amount) {
			double currentBalance = this.balance - amount;
			System.out.println(currentBalance);
			return currentBalance;
		} else 
			throw new Exception("Hello " + customerName + ", Account balance is: " + this.balance + " " + "Insufficient account balance.");
		
	}
	
	public void displayCustomerDetails() {
		System.out.println("Customer Name is: " + this.customerName);
		System.out.println("Account Number is: " + this.accountNumber);
		System.out.println("Balance is: " + balance);
		System.out.println("Email is: " + email);
		System.out.println("Phone Number is: " + phoneNumber);
	}
	
	
}
