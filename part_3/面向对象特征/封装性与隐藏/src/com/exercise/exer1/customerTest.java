package com.exercise.exer1;

public class customerTest {
	public static void main(String[] args) {
		
		Customer cust = new Customer("James", "Harden");
		
		Account account = new Account(100, 2000, 0.0123);
		
		cust.setAccount(account);
		
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(500);
		cust.getAccount().withdraw(3000);
		
		System.out.println("Customer [" + cust.getFirstName()+"," +cust.getLastName()+"] has a account: "
				+ "id is " + cust.getAccount().getId()+",\n"+"annualInterestRate is "+cust.getAccount().getAnnualInterestRate()*100
				+"%,balance is "+cust.getAccount().getBalance());
	}
}
