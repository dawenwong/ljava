package com.oopmid.object类;

import java.util.Date;

/*
 *  == 和 equals()的区别？
 *  
 *  == ：运算符
 *  1、可以使用在基本数据类型变量和引用数据类型变量中
 *  2、如果比较的是基本数据类型变量，就是比较两个变量保存的数据是否相等，不一定类型一样
 *  3、如果比较的是引用数据类型变量，比较的是两个变量地址值是否相同，即两个引用是否指向同一个对象实体
 *  
 *  equals()方法：
 *  1、是一个方法，而非运算符
 *  2、只能使用在引用数据类型上，不能使用在基本数据类型变量上
 *  3、Object类中equals()方法定义：
 *  	public boolean equals(Object obj){
 *  		return (this == obj);
 *  	}
 *   	Object类中定义的equals()方法和==作用相同，
 *  4、像String、Date、File、包装类等都重写了Object类中equals()方法，重写后比较的不是两个引用地址是否相同，比较的是实体内容相同
 *  
 *  5、通常情况下，自定义类使用equals()是比实体内容，需要对Object类equals()方法重写
 * 
 * */
public class EqualsTest {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j); //true
		System.out.println(i == d); //true
		
		boolean b = true;
//		System.out.println(j == b); 
		
		char c = 10;
		System.out.println(i == c ); //true
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2); //true
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println(str1 == str2); //false
		System.out.println(str1.equals(str2)); //true (多态的体现)，这里的equals()是String类重写过
		
		
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1.equals(cust2)); // 使用Customer重写后的equals()方法返回true
		//如果不在Customer中重写equals()方法，使用Object类中的equals()方法，返回false
		
		
		
	}
}
