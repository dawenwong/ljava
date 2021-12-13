package com.oopmid.方法重写;

public class Person{
	
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
	}
	
	public void walk(int distance) {
		System.out.println("走路走了"+distance+"公里");
	}
	
}
