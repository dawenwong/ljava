package com.oopmid.包装类Wrapper;

import org.junit.Test;

/*
 * 包装类：针对八种基本数据类型定义的相应的引用类型--包装类（封装类）
 * 基本数据类型：byte 、 short 、 int 、   long 、float 、 double 、 boolean 、 char
 * 包装类：    Byte 、 Short 、 Integer、 Long 、Float 、Double 、 Boolean 、 Character
 * 包装类中Byte 、 Short 、 Integer、 Long 、Float 、Double 的父类是number类
 * 
 * 包装类的使用，java提供了8种基本数据类型的包装类，是的基本数据类型具有类的特征
 * 
 * 
 * 
 * */
public class WrapperTest {
	
	
	/*
	 * 将String类型==转换==> 包装类和基本数据类。需要调用包装类中parseXxx(String s)方法
	 * 
	 * */
	@Test
	public void test3() {
		// 常见错误
		String str1 = "123";
//		int num1 = (int)str1; // 错误一
//		Integer in1 = (Integer)str1; // 错误二

		int num2 = Integer.parseInt(str1); // 正确的方式
		System.out.println(num2);
		
		float f1 = Float.parseFloat(str1);
		System.out.println(f1);
		
		double d1 = Double.parseDouble(str1);
		System.out.println(d1);
		
		short s1 = Short.parseShort(str1);
		System.out.println(s1);
		
//		char c1 //没有
		byte b1 = Byte.parseByte(str1);
		System.out.println(b1);
		
//		String str2 = "true11"; //false
		String str3 = "1"; // false
		String str2 = "true"; // true
		boolean b2 = Boolean.parseBoolean(str2);
		boolean b3 = Boolean.parseBoolean(str3);
		System.out.println(b2);
		System.out.println(b3);
		
		
		
	}
	
	
	
	/*
	 * （包装类和基本数据类）===>整体转化为String类型
	 * 
	 * 
	 * */
	@Test
	public void test2() {
		int num1 = 10;
		//方式一：连接运算
		String str1 = num1+""; //结果就是String类型
		System.out.println(str1);
		//方式二：调用String重载的valueof(类型 变量)
		float f1 = 12.33f;
		String str2 = String.valueOf(f1);
		System.out.println(str2);
		
		Double d1 = new Double(12.212);
		String str3 = String.valueOf(d1);
		System.out.println(str3);
		
		
		
		
		
	}
	
	
	/*
	 * jdk5.0 新特性自动装箱和自动拆箱
	 * 
	 * */
	@Test
	public void test1() {
		int num = 10;
		method(num); //该方法需要的形参类型是对象，但是传递一个int基本类型数据也可以，就是新特性自动装箱和自动拆箱
		
		// 自动装箱:
		int num1 = 20;
		Integer in1 = num1;  //就可以不使用构造器new
		
		boolean b1 = true;
		Boolean b2 = b1; // 自动装箱
		
		// 自动拆箱:
		int num2 = in1; //自动拆箱
		
		
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	// 包装类转换为基本数据类型，调用包装类的xxxxValue().
	@Test
	public void TestWrapper2() {
		Integer in1 = new Integer(12);  //这种方式不推荐使用了
		// Integer in1 = Integer.parseInt("12"); // 推荐使用这种
		
		int num1 = in1.intValue();  // 将引用类型转换为基本数据类型int
		System.out.println(in1);
		System.out.println(num1+1);
		
		Float f1 = new Float("12.33");
		float f2 = f1.floatValue();
		System.out.println(f1*10); // 也可以做基础运算？
		System.out.println(f2+0.1);
		
		
		
	}
	
	//基本数据类型转换为引用数据类型，调用包装类的构造器
	@Test
	public void TestWrapper1() {
		int num1 = 12;
		Integer in1 = new Integer(num1);
		Integer in2 = new Integer("123");
		System.out.println(in1);
		System.out.println(in2);
		System.out.println(in2.toString());
		System.out.println(in1.equals(in2));
		
//		Integer in3 = new Integer("abc123");  //报错
//		System.out.println(in3.toString());
		
		Float f1 = new Float("1.23");
		Float f2 = new Float(1.23f);
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = new Boolean(true); //true
		Boolean b2 = new Boolean("true"); //true
		Boolean b3 = new Boolean("trUE"); //true  (自动忽略大写)
		Boolean b4 = new Boolean("True1234"); //false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		
		
	}
	
}
