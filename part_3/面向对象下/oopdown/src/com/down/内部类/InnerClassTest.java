package com.down.内部类;

import com.down.内部类.Person.Bird;
import com.down.内部类.Person.Dog;

/*
 * 类的内部成员之五：内部类
 * 	1.java中允许将一个类A声明在另一个类B中，则类A就是内部类，类B称为外部类
 * 
 * 
 * 	2.内部类的分类：成员内部类（静态和非静态） 和  局部内部类（方法内、代码块内、构造器内）
 * 		成员内部类：
 * 			一方面作为外部类的成员：
 * 					  调用外部类的结构
 * 					  可以被static修饰
 * 					  可以被4种不同的权限修饰
 * 			另一方面，作为一个类：
 * 					  类内可以定义属性、方法、构造器等
 * 					  可以被final修饰，表示此类不能被继承，不使用final，就可以被继承
 * 					  可以被abstract修饰,此类不能被实例化了
 * 
 * 4.关注如下的3个问题
 * 		4.1 如何实例化成员内部类的对象
 * 		4.2 如何在成员内部类中区分调用外部类的结构
 * 		4.3 开发中局部内部类的使用
 * */
public class InnerClassTest {
		public static void main(String[] args) {
			//创建Dog实例(静态的成员内部类)
			Person.Dog dog = new Person.Dog();
			dog.show();
			
			//创建Bird实例(非静态的成员内部类)
//			Person.Bird bird = new Person.Bird(); 错误的写法	
			Person p = new Person();
			Person.Bird bird = p.new Bird();
			bird.Sing();
			
			
		}
}



class Person{
	
	String name;
	int age;
	
	public void eat() {
		System.out.println("人吃饭");
	}
	
	
	
	
	
	//静态成员内部类
	static class Dog{
		String name;
		int age;
		
		public Dog() {
			super(); 
		} 
		
		public Dog(String name,int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		public void show() {
			System.out.println("一只修勾勾");
//			eat(); 
		}
		
	}
	//非静态成员内部类
	class Bird{
		String name;
		
		public void Sing() {
			System.out.println("一只小小鸟");
			eat();// 完整 Person.this.eat();
		}
	}
	
	//方法中的内部类
	public void method() {
		
		class innerclassAA{
			
		}
	}
	
	//代码块中的内部类
	{
		 class innerclassBB{
			 
		 }
	}
	
	//构造器中的内部类
	public Person() {
		
		class innerclassCC{
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
