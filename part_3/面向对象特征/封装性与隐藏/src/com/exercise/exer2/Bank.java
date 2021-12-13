package com.exercise.exer2;

public class Bank {
	private Customer[] customers;  //存放客户的数组。此时还没new
	
	private int numberofCustomer;  //记录客户的个数
	
	//构造器
	public Bank() {
		customers = new Customer[10];
	}
	
	//添加客户
	public void addCustomer(String f,String l) {
		Customer cust = new Customer(f, l);
		customers[numberofCustomer] = cust;
		numberofCustomer++;
		//customers[numberofCustomer++] = cust;
		
	}
	
	//获取客户的个数
	public int getNumberofCustomers() {
		return numberofCustomer;
	}
	
	//获取指定索引的客户
	public Customer getCustomer(int index) {
		if(index >= 0 && index < numberofCustomer) {
			return customers[index];
		}
		
		return null;
	}
}
