package com.oopmid.包装类Wrapper;

import org.junit.Test;

public class exercise1 {
	
	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) :  new Double(2.0);
		System.out.println(o1); // 1.0 将int 自动提升了，编译时就同一类型，将int提升为double
	}
	
	@Test
	public void test2() {
		Object o2;
		if(true) 
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);
	}
	
	/*
	 * Integer 内部定义了IntegerCache结构，IntegerCache中定义了Integer[]
	 * 保存了-128-127范围内的整数，如果我们使用自动装箱，给Integer赋值的范围在-128~127范围内
	 * 可以直接使用数组中的元素，不用再去new
	 * 
	 * 
	 * */
	@Test
	public void test3() {
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j ); //比地址不同，false
		
		Integer m = 1;
		Integer n = 1;
		System.out.println(m==n); //自动装箱，true
		
		Integer x = 128;  //相当于new Integer(128);
		Integer y = 128; //相当于new Integer(128);
		System.out.println(x==y); //false
	}
}
