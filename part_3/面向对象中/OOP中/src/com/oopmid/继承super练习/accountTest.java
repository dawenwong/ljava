package com.oopmid.继承super练习;

public class accountTest {
	public static void main(String[] args) {
		Account account = new Account(1001, 20000, 0.045);
		
		account.withdraw(30000);
		System.out.println("您的账户余额为："+account.getBalance());
		account.withdraw(2500);
		account.deposit(3000);
		System.out.println("您的账户余额为："+account.getBalance());
		System.out.println("月利率为："+account.getMonthlyInterest()*100+"%");
		
		
		System.out.println("*******************************");
		CheckAccount ca = new CheckAccount(1122, 20000, 0.045, 5000);
		
		ca.withdraw(5000);
		System.out.println("您的账户余额为："+ ca.getBalance());
		System.out.println("您的可透支额度为："+ca.getOverdraft());
		ca.withdraw(18000);
		System.out.println("您的账户余额为："+ ca.getBalance());
		System.out.println("您的可透支额度为："+ca.getOverdraft());
		ca.withdraw(3000);
		System.out.println("您的账户余额为："+ ca.getBalance());
		System.out.println("您的可透支额度为："+ca.getOverdraft());
	}
}
