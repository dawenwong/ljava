package com.oopmid.继承super练习;

public class Account {
	
	private int id;  //账号
	private double balance; //余额
	private double annualInterestRate;  //年利率
	
	//带参构造器
	public Account(int id,double balance,double annualInterestRate) {
		super();  //删除默认也存在
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	//get和set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
//	public void setBalance(double balance) {
//		this.balance = balance;  //应该不能对外开放set 余额
//	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate =annualInterestRate;
	}
	
	
	//方法
	public double getMonthlyInterest() {  //获取月利率
		return annualInterestRate / 12;
	}
	
	public void withdraw(double amount) { //取钱
		if(balance >= amount) {
			balance -= amount;
			return;
		}
		System.out.println("余额不足");
	}
	
	public void deposit(double amount) {//存钱
		if(amount > 0) {
			balance += amount;
		}
	}
	
}
