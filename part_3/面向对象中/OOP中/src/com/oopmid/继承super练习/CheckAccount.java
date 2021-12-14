package com.oopmid.继承super练习;

public class CheckAccount extends Account{
	
	private double overdraft; //透支额度
	
	//构造器，
	public CheckAccount(int id,double balance,double annualInterestRate,double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}
	
	//对父类方法重写
	@Override
	public void withdraw(double amount) {//余额足够消费
		if(getBalance() >= amount) {
			super.withdraw(amount);//直接调用父类的withdraw比较好
			//setBalance(getBalance() - amount);  //余额正常是不能设置的
		}else if(overdraft >= amount - getBalance()) { //透支额度足够消费
			
			overdraft -= (amount - getBalance());
			
			super.withdraw(getBalance());  //balance 取光
			
		}else {
			System.out.println("超过透支限额！");
		}
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	
}
