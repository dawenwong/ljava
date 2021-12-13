package com.exercise.exer2;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("James", "Harden");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("账户余额为： " + balance);
		
		bank.addCustomer("Stephen", "Curry");
		bank.getCustomer(1).setAccount(new Account(10000));
		double balance1 = bank.getCustomer(1).getAccount().getBalance();
		System.out.println(balance1);
				
		
		System.out.println("银行当前客户："+bank.getNumberofCustomers());
	}
}
