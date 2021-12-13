package com.huhulu.封装性;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		
		p1.setAge(99);
		int age = p1.getAge();
		System.out.println(age);
	}
}
