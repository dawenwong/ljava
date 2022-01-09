package com.down.抽象类与抽象方法;

public class Manager extends Employee {
	
	private double bonus;//奖金
	
	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}
	public Manager(String name,int id,double salary,double bonus) {
		super(name, id, salary);
		this.bonus = bonus;
	}
	
	@Override
	public void work() {
		System.out.println("管理的工作是管理员,提高工作效率!");	
	}
	
}
