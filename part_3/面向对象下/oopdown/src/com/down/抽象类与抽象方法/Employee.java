package com.down.抽象类与抽象方法;
/*
 * 编写一个Employee类，声明为抽象类
 * 包含下面三个属性，name，id，salary
 * 提供必要的构造器和抽象方法：work()
 * 
 * */
public abstract class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	//构造器
	public Employee() {
		super();
	}
	public Employee(String name,int id,double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//抽象方法
	public abstract void work();
	
	
}
