package com.down.抽象类与抽象方法;

public class EmployeeTest {
	public static void main(String[] args) {
//		Employee e1 = new Employee();
		
		Manager manager = new Manager("Cook", 001, 1000000, 100000);
		manager.work();
		
		commonEmployee commonemployee = new commonEmployee();
		commonemployee.work();
		
	}
				
			
}
