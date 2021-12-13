package com.oopmid.方法重写;

public class Student extends Person{  

	private String major;
	
	//构造器
	public Student() {
		
	}
	
	public Student(String major) {
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		
		this.major = major;
	}

	public void study() {   
		System.out.println("学习的专业是"+major);
	}
	
	//override或overwrite
	//对父类中的eat方法进行了重写
	public void  eat() {
		System.out.println("学生应该多喝牛奶多吃蛋白蔬菜");
	}

}
