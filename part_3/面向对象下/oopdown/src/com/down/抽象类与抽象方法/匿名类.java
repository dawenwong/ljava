package com.down.抽象类与抽象方法;
/*
 *抽象类的匿名子类
 * 
 * */
public class 匿名类 {
	public static void main(String[] args) {
		method(new String("123")); //匿名对象
		Worker worker = new Worker();
		method1(worker); //非匿名的类非匿名的对象
		
		//创建了一个匿名子类的对象：employee
		Employee employee = new Employee() {
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("创建匿名子类的对象");
			}
		};
		
		//创建匿名子类的匿名对象
		method1(new Employee() {
			
			@Override
			public void work() {
				// TODO Auto-generated method stub
				System.out.println("创建匿名子类的匿名对象");
			}
		});
		
		
		
		
		
		
	}
	
	public static void method(String str) {
		
	}
	
	public static void method1(Employee e) {
		e.work();
	}
}

class Worker extends Employee{
	
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("搬砖");
	}
}