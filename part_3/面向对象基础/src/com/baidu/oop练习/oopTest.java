package com.baidu.oop练习;


public class oopTest {
	public static void main(String[] args) {
		
		Person p1 = new Person(); //实例化对象（造一个对象）
		p1.name = "Tom";
		p1.age = 22;
		p1.sex  = 1;
		
		p1.study();
		p1.showAge();
		int newAge = p1.addAge(2);
		System.out.println(p1.name + newAge);
	}
}
