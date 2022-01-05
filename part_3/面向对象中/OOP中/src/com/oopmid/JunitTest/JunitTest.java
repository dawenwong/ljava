package com.oopmid.JunitTest;
import org.junit.Test;

/*
 * Java中的JUnit单元测试
 *  
 *  步骤：
 *  	1.选中当前工程-右键选择：build path -add libraries -JUnit5-下一步
 *  	2.创建一个java类进行单元测试
 *  		此时的Java类要求：
 *  			①此类是public的
 *  			②此类提供公共的无参的构造器
 *  	3.此类中声明单元测试方法：
 *  		此时的单元测试方法：
 *  			①方法的权限是public
 *  			②没有返回值
 *  			③没有形参
 *  	4.此单元测试方法上需要声明注解：@Test,并在单元测试类中导入：import org.junit.Test;
 * 		5.声明好单元测试方法后，就可以在方法体内测试相关的代码
 * 		6.写完代码以后，左键双击单元测试方法名，右键：run as - JUnit Test
 *	说明：
 *		1、如果执行结果没有任何异常：绿条
 *		2、如果执行结果出现异常：红条
 * */
public class JunitTest {
	int num = 10;
	@Test
	public void testEquals() {	
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
		System.out.println(num); // 直接调属性
		show(); //直接调方法，不能实例化JUnitTest
	}
	
	public void show() {
		num = 20;
		System.out.println("show()....");
	}
	
	@Test
	public void testToString() {
		String s3 = "GG";
		System.out.println(s3);
		show();
	}
	
	

	
	
	
	
	
	
}
