package com.down.模板设计模式;

import java.util.Scanner;

public class PayrollSystem {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入当月的月份：");
		int month = scanner.nextInt();
		
		Employee[] emps = new Employee[2];
		emps[0] = new SalariedEmployee("张三", 1001, new MyDate(1991, 2, 20),10000);
		emps[1] = new HourlyEmployee("李四", 3003, new MyDate(1999, 10, 1),60,240);
		
		for(int i = 0;i < emps.length;i++ ) {
			System.out.println(emps[i]);
			double salary  = emps[i].earnning();
			System.out.println("月工资："+salary);
			
			if(month == emps[i].getBirthday().getMonth()) {
				System.out.println("生日快乐奖励100元");
			}
		}
	}
}
