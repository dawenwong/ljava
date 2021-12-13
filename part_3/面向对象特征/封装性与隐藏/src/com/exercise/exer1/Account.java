package com.exercise.exer1;

public class Account {
	
	private int Id;  //id
	private double balance;  //余额
	private double annualInterestRate;  //年利率
	
	//构造器
	public Account() {
		
	}
	
	public Account(int id,double balance,double annualInterestRate) {
		this.Id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//方法
	public int getId() {
		return this.Id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getAnnualInterestRate() {
		
		return this.annualInterestRate;
	}
	
	public void setId(int id) {
		this.Id = id;
	}
	
	public void setBalance(double balance) {
		
		this.balance = balance;
	}
	
	public void setAnnuanlInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	//取钱
	public void withdraw(double amount) { 
		//取钱时先判断余额和取款金额大小
		if(balance < amount) {
			System.out.println("余额不足，取钱失败。");
			return;
		}
		balance -= amount;
		System.out.println("成功取出： " + amount + "元");
	}
	
	//存钱
	public void deposit(double amount) {
		//存钱不能为0或负数
		if(amount > 0) {
			balance += amount;
			System.out.println("成功存入： "+ amount + "元");
		}
	}
	
}
