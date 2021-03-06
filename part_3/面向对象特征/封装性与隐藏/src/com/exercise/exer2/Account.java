package com.exercise.exer2;

public class Account {
	
	private double balance;
	
	//构造器
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	
	//getter
	public double getBalance() {
		return this.balance;
	}
	
	//存钱
	public void deposit(double amt) {
		if(amt > 0) {
			balance += amt;
			System.out.println("存钱成功");
		}
	} 
	
	//取钱
	public void withdraw(double amt) {
		if(balance >= amt) {
			balance -= amt;
			System.out.println("取钱成功");
			return;
		}
		System.out.println("余额不足,取钱失败");
	}
	
}
