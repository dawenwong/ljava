package com.oopmid.继承性;

public class Student extends Person{   //使用extends关键字 表示继承，继承Person中属性、方法
	
//	private String name; //通过extends Person，在person中也有这属性，可以不定义
//	private int age; //通过extends Person，在person中也有这属性，可以不定义
	private String major; //这是Student 独有的，不是继承得来
	
	//构造器
	public Student() {
		
	}
	
	public Student(String name,int age,String major) {
		//this.name = name;    
		//this.age = age;  //这个没extends 过来
		this.major = major;
	}
	
	//get和set
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		
		this.major = major;
	}

	
	
	//方法
//	public void  eat() {//通过extends Person，在person中也有这方法，可以不定义
//		System.out.println("吃饭");
//	}
//		
//	public void sleep() {//通过extends Person，在person中也有这方法，可以不定义
//		System.out.println("睡觉");
//	}
	
	public void study() {   //这是Student 独有的，不是继承得来
		System.out.println("学习");
	}
	
	
	

}
