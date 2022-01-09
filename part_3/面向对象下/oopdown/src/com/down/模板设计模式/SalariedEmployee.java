package com.down.模板设计模式;

public class SalariedEmployee extends Employee{
	
	private double monthlySalary;

	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
		// TODO Auto-generated constructor stub
	}
	
	public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double earnning() {
		// TODO Auto-generated method stub
		return monthlySalary;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String toString() {
		return "SalariedEmployee ["+super.toString() + "]";
	}
	
}
