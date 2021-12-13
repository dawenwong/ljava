package com.baidu.array;

/*
 * 5.数组元素的默认初始化值
 *    :整型的默认值都是0
 *    :浮点型的默认值都是0.0
 *    :char的默认值都是0或'\u0000',而非'0'
 *    :boolean的默认值都是fasle
 *    :String的默认值都是null 
 *    
 * 6.数组的内存解析
 * 	  :stack栈主要存放局部变量
 * 	  :heap堆 主要存放new出来的结构：对象、数组
 * 	      :方法区 主要包括常量池和静态域
 */
public class 数组2 {
	public static void main(String[] args) {
		// 数组元素的默认初始化值
		// int[] arr = new int[4];
		// long[] arr = new long[4];
		// float[] arr = new float[4];
		// char[] arr = new char[4];
		// boolean[] arr = new boolean[4];
		String[] arr = new String[4];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
