package com.erroException.TryCatchFinally;

import org.junit.Test;

/*
 * 
 * 异常的处理：抓抛模型
 * 
 * 过程一：“抛”：程序在正常执行的过程中，一旦出现异常，就会在异常代码处生产一个对应异常类的对象
 * 				并将此对象抛出。
 * 				一旦抛出对象后，其后的代码就不在执行
 * 
 * 
 * 过程二：“抓”：可以理解异常的处理方式：try-catch-finally 和 throws 
 * 			
 * java异常处理方式：
 * 	方式一：try-catch-finally
 * 
 * 	方式二：throws + 异常处理
 * 
 * 
 * 二：try-catch-finally的使用
 * 		try{
 * 		//可能出现异常的代码	
 * 	}catch(异常类型1 变量名1){
 * 		//处理异常类型1
 * 	}catch(异常类型2 变量名2){
 * 		//处理异常类型2
 * 	}catch(异常类型3 变量3){
 * 		//处理异常类型3
 * 	}
 * 	...
 * 	 finally{
 * 		//一定会执行的代码
 * 	}
 * 
 * 说明：
 * 	1.finally是可选的
 * 	2.使用try将可能出现异常的代码包起来，在执行过程中，一旦出现异常，就会生成一个对应异常类的对象，根据此对象的类
 * 	  型，去catch中进行匹配
 *  3.一旦try中的异常对象匹配到某个catch时，就进入catch中进行异常处理，一旦处理完成就跳出当前try-catch结构（在没有写finally的前提下）
 *    继续执行其后的代码
 *  4.catch中的异常类型在没有子父类时，前后顺序无所谓；在有子父类关系时，若父类写在前子类在后，就会报错.
 *  5.常用的异常处理的方式，① 使用getMessage()方法  ② 使用printStackTrace()方法   
 * 	6.在try结构中声明的变量，在出了try结构就不能被调用了
 * 
 * 
 * 使用try-catch处理编译异常，在编译时不报错，但运行时还是可能报错，只是将错误延迟到运行时
 * 
 * */
public class tryCatchFinallyTest {
	
	//NumberFormatException
	@Test
	public void test1() {
		String str = "123";
		str = "abc";
		try {
			int number = Integer.parseInt(str);
			System.out.println("hello------------1");
		}catch (NullPointerException e) {
			
			System.out.println(e.getMessage());
			
		}catch (NumberFormatException e) {
			
			// System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
		}
//		System.out.println(number);  
		System.out.println("hello-------------2"); //异常被捕获后，会执行到这
	}
}






