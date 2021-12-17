package com.oopmid.多态性;

public class Test {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.eat();
		p.walk();
		p.name = "张三";
		p.age = 27;
		System.out.println("name: "+p.name+" age: "+p.age);
		System.out.println("**************************************");
		Person m = new Man(); 
		//m.earMoney();
		m.eat();
		m.walk();
		m.name  = "唐伯虎";
		m.age = 24;
		System.out.println("name: "+m.name+" age: "+m.age);
		System.out.println("**************************************");
		
		Person w = new Woman();
		w.eat();
		w.walk();
		w.name = "秋香";
		w.age = 18;
		System.out.println("name: "+w.name+" age: "+w.age);
		
		
	}
}
