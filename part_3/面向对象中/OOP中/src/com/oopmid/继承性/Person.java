package com.oopmid.继承性;

public class Person extends Mammal{
	
	private String name;
	private int age;
	
	//构造器
	public Person() {
		
	}
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	//get和set
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
	
	
	//方法
	public void  eat() {
		System.out.println("吃饭");
		sleep();
	}
	
	private void sleep() {  //私有化，
		System.out.println("睡觉");
	}
	
}
