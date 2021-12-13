package com.oopmid.super使用;

public class Student extends Person {
	
	
	private String major;
	int id = 1002;// 学生证号
	
	public Student() {
		
		
	}
	
	public Student(String major) {
		super(); //默认情况下就是super()
		this.major = major;
	}
	
	public Student(String name,int age,String major) {
		//this.name = name; 
		//this.age = age;  //如果父类中属性加了private后就不能用“this.属性”了
		super(name, age); //调用父类Person中形参是name和age的构造器
		this.major = major;
		
		
		
	}
	
	
	
	
	
	
	@Override
	public void eat() {
		System.out.println("学生多吃有营养的");
	}
	
	public void study() {
		System.out.println("学生多学习知识");
		this.eat();   //本类重写后的方法，可以省略this.
		//eat();
		super.eat(); //父类中的方法
	
	}
	
	public void show() {
		System.out.println("name =  " +getName() +"  ,age =  "+ getAge()+" ,major= "+major);  //都行

		System.out.println("id =  "+ this.id);  //从本类找id1002
		
		System.out.println("id = "+ super.id);  //父类的id 1001
	}

}