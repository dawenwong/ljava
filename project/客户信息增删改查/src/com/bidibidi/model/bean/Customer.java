package com.bidibidi.model.bean;

/**
 * Customer实体类，用来封装客户信息
 * (满足javabean)
 * 
 * */
public class Customer {
	
	//属性
	private String name; //客户姓名
	private char gender;  //性别
	private int age;     //年龄
	private String phone;//电话
	private String email;//邮箱
	
	//构造器
	public Customer() {
		//空构造器
	}
	
	public Customer(String name,char gender,int age,String phone,String email) {
		
		this.name = name;
		this.gender = gender;
		this.age  = age;
		this.phone = phone;
		this.email = email;
	}
	
	//get和set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
