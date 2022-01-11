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
