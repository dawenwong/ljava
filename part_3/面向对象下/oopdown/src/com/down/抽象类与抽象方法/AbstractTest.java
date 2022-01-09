package com.down.抽象类与抽象方法;

import java.util.function.IntToDoubleFunction;

/*
 * abstract 关键字的使用
 * 1.abstract:抽象类
 * 2.abstract 可以用来修饰的结构：类、方法
 * 
 * 3.abstract 修饰类：抽象类
 * 		3.1 此类不能被实例化(造对象)
 * 		3.2 抽象类中一定有构造器，便于子类实例化时调用（涉及：子类对象实例化的全过程）
 * 		3.3 开发中，都会提供抽象类的子类，让子类对象实例化，完成相关的操作
 * 
 * 4.abstract 修饰方法：抽象方法
 * 		4.1 抽象方法只有方法的声明，没有方法体
 * 		4.2 包含抽象方法的类，一定是一个抽象类，反之抽象类不一定包含抽象方法的。
 * 		4.3 若子类重写了父类中的所有的抽象方法后，此子类方可实例化
 * 			若子类没有重写父类中的所有的抽象方法，则子类也是一个抽象类，子类也用abstract修饰
 * 		
 * */
public class AbstractTest {
	public static void main(String[] args) {
		//一旦Person类抽象了，就不可实例化
//		Person p1 = new Person(); //在Person类前面加上abstract关键字后
								 //Cannot instantiate the type Person
//		p1.eat();
	}
}

abstract class Person{  //加上abstract抽象了，不能实例化造对象
	String name;
	int age;
	
	public Person() {
	
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// 这样不是抽象方法
//	public void eat() {
//		
//	}
	//这样是抽象方法
	public abstract void eat();
	
	public void walk() {
		System.out.println("人：走路");
	}
}

class Student extends Person{
	
	public Student(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void eat() {
		System.out.println("学生：吃外卖");
	}
}
