package com.down.Block代码块;

import java.util.zip.InflaterInputStream;

/*
 *
 * 类的成员之四：代码块（或初始化块）
 * 1.代码块的作用：通常用来初始化类或者对象
 * 2.只有使用static修饰，代码块分为static{}和{}两类
 * 3.因此代码块可分为：静态代码块和非静态代码块
 * 
 * 4.静态代码块
 * 		1、内部可以有输出语句
 * 		2、随着类的加载而执行，而且只执行一次
 * 		3、作用：初始化类的信息
 * 		
 * 
 * 5.非静态代码块
 * 		1、内部可以有输出语句
 * 		2、随着对象的创建而执行
 * 		3、没创建一个对象，就执行一次非静态代码块
 * 		4、作用：可以在创建对象时，对对象的属性等进行初始化
 * 	
 * 对属性可以赋值的位置：
 * 	① 默认初始化
 * 	② 显示初始化
 * 	③ 构造器中初始化
 * 	④ 有了对象后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 *  ⑤ 在代码块中赋值
 * */
public class BlockTest {
	public static void main(String[] args) {
		String desc = Person.desc;  //类加载的时候就会执行static{}内的代码
		System.out.println(desc);
		Person p1 = new Person(); //实例化类的时候就会执行{}内的代码
		Person p2 = new Person("Tom",22); //每创建一次执行一次
//		Person.info();
	}
}

class Person{
	//属性
	String name;
	int age;
	static String desc = "一个人的类";
	//构造器
	public Person() {
	
	}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	//代码块
	//静态代码块
	static{
		System.out.println("hello,static block!-1");
		desc = "一个爱学习的人";
		info();	
//		eat(); //不可以调用非静态方法
	}
	static{
		System.out.println("hello,static block!-2");
	}
	//非静态代码块
	{
		System.out.println("hello,non-static block!");
		info(); //可以调用静态方法
	}
	//一般方法
	public void eat() {
		System.out.println("吃东西");
	}
	//Object类toString()方法重写
	@Override
	public String toString() {
		return "Person [name=" + name + ",age=" + age + " ]";
	}
	
	public static void info() {
		System.out.println("一个快乐的人");
	}
	
	
	
	
	
	
	
	
}