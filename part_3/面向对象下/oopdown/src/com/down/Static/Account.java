package com.down.Static;

public class Account {
	private int id;  //账号
	private String pwd="000000"; //密码
	private double balance; //余额
	
	private static double interestRate; //利率
	private static double minBalance = 1.0; //最小余额
	private static int init = 1001;//用于自动生成id使用
	
	//空参构造器
	public Account() {
		id = init++;
	}
	public Account(String pwd,double balance) {
		this();
		this.pwd = pwd;
		this.balance = balance;
	}
	
	//getters 和 setters方法
	public int getId() {
		return id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public double getBalance() {
		return balance;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setMinBalance(double minBalance) {
		Account.minBalance = minBalance;
	}
	public static double getMinBalance() {
		return minBalance;
	}
	
	
	//重写toString()方法
	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
}
