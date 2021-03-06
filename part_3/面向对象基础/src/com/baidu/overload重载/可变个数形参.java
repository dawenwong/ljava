package com.baidu;

public class 可变个数形参 {
	public static void main(String[] args) {
		可变个数形参 test = new 可变个数形参();
		
		test.show(12);
		test.show("123"); //这个会优先使用show(String i)方法，
		test.show("hello","你好","world","世界");  //直接显示的是地址，是用数组存储的数据，因此这种写法等同于数组
	}
	
	
	//以下方法构成重载
	public void show(int i) {
		System.out.println(i);
	}
	
	public void show(String i) {
		System.out.println(i);
	}
	
	public void show(String ... strs ) { //...就是可变参数形参的表示方式
		//System.out.println(strs);  //这里需要遍历，直接打印是地址
		for(int i = 0; i < strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
	
//	public void show(String[] strs) {  
//		这个和上面可变个数形参 原理相同，是报错“重复”
//	}
//	
	
	public void show(String s,String ...strs) {
		//不会报错
	}
	
//	
//	public void show(String ...strs ,String s) {
//		//报错：The variable argument type String of the method show must be the last parameter
//	}
	
	
	
	
	
	
	
	
}
