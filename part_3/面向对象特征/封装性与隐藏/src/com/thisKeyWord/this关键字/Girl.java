package com.thisKeyWord.this关键字;

public class Girl {
	private String name;
	private int age;
	
	
	public Girl() {
		
	}
	
	
	
	public Girl(String name, int age) {
		
		this.name = name;
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
	
	public void marry(Boy boy) {
		System.out.println("我愿意嫁给"+boy.getName());
		boy.say(this);  //this和new的对象绑定？A new 就是A，B new就是B？
	}
	
}
