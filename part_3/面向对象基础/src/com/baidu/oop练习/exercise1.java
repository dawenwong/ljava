package com.baidu.oop练习;

//在一个类中实现
public class exercise1 {
	public static void main(String[] args) {
		
		exercise1 e1 = new exercise1();
		
		e1.method();
	}
	
	public void method() {
		for(int i = 0;i < 10; i++) {
			for(int j = 0;j < 8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
