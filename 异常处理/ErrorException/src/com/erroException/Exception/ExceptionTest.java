package com.erroException.Exception;

import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 *
 * exception:编译异常（非受检异常）和运行异常（受检异常）
 * 
 * 一、异常体系结构
 * 
 * java.lang.Throwable
 * 		|----java.lang.Error :一般不编写针对性的代码进行处理
 * 		|----java.lang.Exception:可以进行异常的处理
 * 		   |----编译时异常（checked）
 * 		   		|----IOException
 * 					 |----FileNotFoundException
 * 				|----ClassNotFoundException
 *         |----运行时异常（unchecked,RuntimeException）
 *         		|----NullPointerException
 *         		|----ArrayIndexOutOfBoundsException
 *         		|----ClassCastException
 *         		|----NumberFormatException
 *         		|----InputMismatchException
 *         		|----ArithmeticException
 *         
 * 常见的异常？
 *         
 *         
 * */			
public class ExceptionTest {
	//*********************以下是编译时异常************************************
	
	
	
	
	
	
	//*********************以下是运行时异常************************************
	
	//ArithmeticException
	@Test
	public void test6() {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
	}
	
	//InputMismatchException
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();  //控制台输入“abcgadsa”
		System.out.println(score);
		scanner.close();
	}
	
	//NumberFormatException
	@Test
	public void test4() {
		String str = "123";
		str = "abc";
		int number = Integer.parseInt(str);
		System.out.println(number);
		
	}
	
	//ClassCastException
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String)obj;
	}
	
	
	//ArrayIndexOutOfBoundsException
	@Test
	public void test2() {
		int[] arr = new int[10];
//		System.out.println(arr[10]);
		
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
		
	}
	
	//NullPointerException
	@Test
	public void test1() {
		int[] arr = null;
//		System.out.println(arr[0]);
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
	}

}
