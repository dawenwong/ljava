package com.baidu.array;

/*
 * 
 * 
 * -数组长度一旦确定不能修改
 * 
 * */
public class 数组1 {
	public static void main(String[] args) {

		// -静态声明一个数组
		int[] age = new int[] { 1001, 1002, 1003, 1004, 1005 }; // -声明一个存放int类型数据的数组，共有5个元素

		// 动态声明一个存放5个字符串元素的数据
		String[] names = new String[5];

		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "燕六";
		names[4] = "赵七";

		System.out.println(names.length);
		System.out.println(age.length);
		for (int i = 0; i < names.length; i++) { // 使用length属性可以获得数组的长度
			System.out.println(names[i]);
		}
	}
}
