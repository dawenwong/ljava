package com.oopmid.super使用;

public class Person {
	
	private String  name;
	private int age;
	int id = 1001; //身份证号
	
	
	
	public Person() {
		
		
	}
	
	
	public  Person(String name) {
		
		this.name = name;
	}
	
	public Person(String name,int age) {
		this(name); //调用形参是name的构造器，即上面
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void eat() {
		System.out.println("人类：吃饭");
	}
	
	
	public void walk() {
		System.out.println("人类：走路");
	}
	
}
