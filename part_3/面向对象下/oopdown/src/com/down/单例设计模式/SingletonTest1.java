package com.down.单例设计模式;
/*
 * 单例设计模式：
 * 	所谓类的单例设计模式，就是采取一定的方法保证在整个软件中，对某个类只能存在一个对象实例
 * 
 * 饿汉式和懒汉式的区别？
 * 饿汉式：
 * 		缺点：加载类就就在对象，可能不用，占用内存空间
 * 		优点：饿汉式是线程安全的
 * 懒汉式：
 * 		缺点：目前是存在线程安全问题的，后面新知识可改
 * 		优点：延迟创建对象，节约内存空间
 * 	
 * */

public class SingletonTest1 {
	public static void main(String[] args) {
//		Bank bank1 = new Bank();
		
		Bank bank1 = Bank.getInstanceBank();
		Bank bank2 = Bank.getInstanceBank();
		System.out.println( bank1 ==bank2); // true，同一个地址，指向堆中一个对象
	}
}

//单例设计模式一：饿汉式
class Bank{
	
	// 1.提供一个private的构造器
	private Bank() {
		
	}
	
	//2.内部创建类的对象
	//2.1 因为要在静态方法使用，所以也比需要是静态变量
	private static Bank instanceBank  = new Bank();
	
	//3.提供公共的方法，返回类的对象
	//3.1 必须提供一个静态方法，因为不能在类外部new一个对象，是非静态方法的话就没法调用
	public static Bank getInstanceBank() {
		return instanceBank;
	}
}