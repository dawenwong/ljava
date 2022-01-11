package com.erroException.throwsTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 异常处理方式二：throws + 异常类型
 * 1."throws"+异常，写在方法的声明处，指明此方法执行时，可能会抛出异常类型
 * 	一旦当方法体执行时出现异常，仍会在异常代码处生成一个异常类的对象；此对象满足throws后异常类型时，就会被抛出
 * 	异常代码后续的代码就不会执行了
 *  
 * 2.try-catch-finally 真正的将异常处理掉了，throws只是将异常抛给方法的调用者，并没有将异常真正的处理掉
 * 3.开发中选择使用try-catch-finally 还是使用throws？
 * 	3.1 如果父类中被重写的方法没有throws方式处理异常，则子类重写的方法也不能使用throws，意味着
 * 		子类重写的方法中有异常，必须使用try-catch-finally方式处理。
 * 	3.2 执行的方法中，先后又调用了另外的几个方法，这几个方法是递进关系执行的，建议这几个方法使用throws
 * 		的方式进行处理，而执行的主方法可以考虑使用try-catch-finally方式处理
 * 
 * try-catch-finally可以同时使用，语法上可行，但是选择其中一种可以了。
 *	
 * 
 * */
public class thorwsTest {
	
	//这里在抛就只能给JVM了
	public static void main(String[] args) {
		
		try {
			method2();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//method3();
		
	}
	
	
	public static void method3() {
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//继续将方法抛给调用method2()的
	public static void method2() throws IOException { //FileNotFoundException 是IOException的子类
		method1();
	}
	
	// 将异常抛给调用method1()的
	public static void method1() throws FileNotFoundException,IOException{
		File file = new File("hello.txt");
		FileInputStream fis = new FileInputStream(file);
		
		System.out.println("会不会执行？");
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		fis.close();
		
	}
}
