package com.oopmid.exercise;

public class InstanceTest {
	public static void main(String[] args) {
		InstanceTest test = new InstanceTest();
		test.method(new Person());
//		test.method(new Student());
//		test.method(new Graduate());
		
		
		
	}
		
	public void method(Person e) {
		String str = e.getInfo();  //虚拟方法调用
		System.out.println(str);
		
		if(e instanceof Graduate) {
			System.out.println("a Graduate Student");
			System.out.println("a student");
			System.out.println("a person");
		}else if (e instanceof Student) {
			System.out.println("a student");
			System.out.println("a person");
		}else {
			System.out.println("a person");
		}
	}
}


class Person{
	protected String name = "person";
	protected int age = 50;
	
	public String getInfo() {
		return "Name: "+name+"\n"+"Age: "+age;
	}
			
}


class Student extends Person{
	protected String school = "cq";
	public String getInfo() {
		return "Name: "+name+"\n"+"Age: "+age+"\n"+"School: "+school;
	}

}


class Graduate extends Student{
	public String major = "CS";
	public String getInfo() {
		return "Name: "+name+"\n"+"Age: "+age+"\n"+"School: "+school+"\n"+"Major: "+major;
	}
}











