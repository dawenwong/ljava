package com.construct.构造器;


/*
 * 
 * -如果没有显式的定义构造器,默认会提供一个空参的构造器
 * -定义构造器的格式:
 * 		--  权限修饰符  类名( 形参列表 ){}
 * 
 * -一个类中可以定义多个构造器,构成重载
 * 
 * -一旦定义了显式的构造器系统就不在提供默认的构造器
 * 
 * 
 * */
public class PersonTest {
	public static void main(String[] args) {
		//创建对象:new + 构造器
		    
		Person p1 = new Person();  //Person()这个结构就称为构造器,作用就是创建对象
		
		Person p2 = new Person("Jerry");  //通过形参，初始化信息
		
		Person p3 = new Person("Tom",10);
		
//		p3.age;
//		Multiple markers at this line
//		- The field Person.age is not visible
//		- Syntax error, insert "VariableDeclarators" to complet
		
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.getAge());
		p1.stduy();
	}
}


class Person{
	//年龄
	private int age;
	String name;
	
	
	//构造器
	//默认构造器,与类同名
//	public Person() {  
//		
//	}
	
	//自定义构造器
	public Person() {
		
		System.out.println("使用Person构造器");
	}
	
	public Person(String n) {
		name = n;   //创建对象时，通过形参初始化值
	}
	
	public Person(String n,int a) {
		name = n;
		age = a;
	}
	
	//setAge方法
	public void setAge(int a) {
		if(a < 0 || a>130) {
			
			System.out.println("输入不合理");
			return;
		}
		age = a;
	
	}
	
	//getAge方法
	
	public int getAge() {
		return age;
	}
	
	
	public void stduy() {
		
		System.out.println("学习");
	}
	
	
}