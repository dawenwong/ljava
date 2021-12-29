package com.oopmid.多态性;

public class Person {
	
	private String name;
	private int age;
	
	public void eat() {
		System.out.println("人：吃饭");
	}
	
	public void walk() {
		System.out.println("人：走路");
	}
	
	//get和set
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
