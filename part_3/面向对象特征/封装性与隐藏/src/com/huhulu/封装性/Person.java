package com.huhulu.封装性;

public class Person {
	//年龄
	private int age;
	
	
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
}
