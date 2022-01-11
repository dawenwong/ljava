package com.erroException.TryCatchFinally;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
/*
 * 异常处理try-catch-finally的使用
 * 
 * finally是可选的，作用：一定会执行代码
 * 	1.finally中的代码一定会被执行，即使try中和catch有异常，try中有return语句，catch有return语句
 * 
 * 	2.像数据库连接、输入输出流、网络编程Socket等资源，JVM是不能自动回收的，需要自己手动的进行资源的释放。
 * 	 这些资源释放的操作就得放在finally中。
 * 
 * 
 * */


public class FinallyTest {
	
	@Test
	public void test3() {
		//快捷方式（eclipse中）选中代码块，鼠标右键-->Surround With--->Try/catch Block
		FileInputStream fis = null;//在try块外部声明
		try {
			File file = new File("hello.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			while(data != -1 ) {
				System.out.println((char)data);
				data = fis.read();
			}
			// fis是try块中变量，外面不能调用
//			fis.close(); //将关闭输入输出放在这里，若前面异常就执行不到，应该将其放在finally中
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		//嵌套一个try/catch
		finally {
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	

	@Test
	public void test2() {
		
		int num = method();
		System.out.println(num);
	}
	public int method() {
		try {
			int[] arr = new int[3];
			System.out.println(arr[4]);
			return 1;
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("一定会被执行！！！");
		}
	}
	
	
	
	@Test
	public void test() {
		
		try {
			
			int a = 10;
			
			int b = 0;
			
			System.out.println(a / b);
			
		}catch (ArithmeticException e) {
			
			//e.printStackTrace();
			int[] arr = new int[3];
			System.out.println(arr[4]);
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		
		finally {
			
			System.out.println("一定会被执行！");
		}
	}
	
	
}
