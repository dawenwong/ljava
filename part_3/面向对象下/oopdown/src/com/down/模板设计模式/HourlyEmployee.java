package com.down.模板设计模式;

public class HourlyEmployee extends Employee{
	
	private int wage; //每小时工资
	private int hour; //月工作的小时数
	
	public HourlyEmployee(String name,int number,MyDate birthday) {
		super(name, number, birthday);
	}
	public HourlyEmployee(String name,int number,MyDate birthday,int wage,int hour) {
		super(name, number, birthday);
		this.wage = wage;
		this.hour = hour;
	}
	
	@Override
	public double earnning() {
		
		return wage * hour;
	}
	
	public String toString() {
		
		return "HourlyEmployee ["+super.toString()+"]";
	}
}
