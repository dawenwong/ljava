package com.oopmid.多态性;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Animal());
		System.out.println("****************************");
		test.func(new Dog());  //如果存在方法重载，会优先使用func(Dog dog)方法
		System.out.println("*****************************");
		test.func(new Cat()); //如果存在方法重载，会优先使用func(Cat cat)方法
	}
	
	public void func(Animal animal) {  // Animal animal = new Dog(); 
		animal.eat();
		animal.shout();
	}
	
	// 没有多态性的话，就只能通过下面方法重载来是实现,
	// 
//	public void func(Dog dog) {
//		System.out.println("调用重载方法");
//		dog.eat();
//		dog.shout();
//	}
//	public void func(Cat cat) {
//		System.out.println("调用重载方法");
//		cat.eat();
//		cat.shout();
//	}
}


class Animal{
	
	public Animal() {
		
	}
	
	public void eat() {
		System.out.println("动物：进食");
	}
	
	public void shout() {
		System.out.println("动物：瞎叫");
	}
}

class Dog extends Animal{
	@Override
	public void eat() {
		System.out.println("狗狗，吃狗粮");
	}
	
	@Override
	public void shout() {
		System.out.println("狗狗，汪汪汪的叫");
	}
}

class Cat extends Animal{
	@Override
	public void eat() {
		System.out.println("猫猫，吃喵粮");
	}
	@Override
	public void shout() {
		System.out.println("猫猫，喵喵喵的叫");
	}
}
















