package com.oopmid.多态性;

public class Test {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.eat();
		p.walk();
		p.setName("张三");
		p.setAge(27);
		System.out.println("name: "+p.getName()+" age: "+p.getAge());
		System.out.println("**************************************");
		// 多态性
		/*
		 * 1、一个事物的多种形态
		 * 2、父类的引用指向子类的对象，（或子类的对象赋给父类引用）
		 * 3、多态的使用，虚拟方法的使用
		 * 		3.1 有了对象的多态性后，在编译期只能调用父类中声明的方法，但在运行期，实际是执行的子类重写父类的方法
		 * 		（编译看左边，运行看右边）
		 * 4、 多态的使用前提，①类的继承关系，②要有方法的重写
		 * */
		Person p2 = new Man(); 
		//m.earMoney();
		p2.eat();  //调的是man重写的父类的方法
		p2.walk(); //调的是man重写的父类的方法
		//m.earMoney(); //使用man子类的方法不行
		p2.setName("唐伯虎");
		p2.setAge(24);
		System.out.println("name: "+p2.getName()+" age: "+p2.getAge());
		System.out.println("**************************************");
		
		Person p3 = new Woman();
		p3.eat();  //调的是woman重写的父类的方法
		p3.walk(); //调的是woman重写的父类的方法
		p3.setName("秋香");
		p3.setAge(18);
		System.out.println("name: "+p3.getName()+" age: "+p3.getAge());
		
		
	}
}
