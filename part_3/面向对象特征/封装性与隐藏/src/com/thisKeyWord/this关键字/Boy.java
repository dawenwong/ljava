package com.thisKeyWord.this关键字;

public class Boy {
	private String name;
	private int age;

	//快捷方式生成get和set方法，
	//方法一：Source->Generate Getters and Setters
	//方法二：Alt + Shift + S 组合键 然后选择
	
	//同理可以选择生成构造器
	public Boy() {
		
	}
	
	public Boy(String name) {
		this.name = name;
	}
	

	public Boy(int age) {
		this.age = age;
	}

	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	
	public void say(Girl girl) {
		
		System.out.println("我愿意娶"+girl.getName());
	}



	
	
}
