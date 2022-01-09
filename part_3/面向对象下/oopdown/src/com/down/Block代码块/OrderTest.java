package com.down.Block代码块;
/*
 * 
 * 对属性可以赋值的位置：
 * 	① 默认初始化
 * 	② 显示初始化 、 ⑤ 在代码块中赋值
 * 	③ 构造器中初始化
 * 	④ 有了对象后，可以通过“对象.属性”或“对象.方法”的方式，进行赋值
 *  
 *  
 *  执行顺序：① - ②/⑤ - ③ - ④
 * */
public class OrderTest {
	public static void main(String[] args) {
		Order o1 = new Order();
		System.out.println(o1.id);
	}
}

class Order{
	//这样的顺序 id最后等于4
//	int id = 3; //显示初始化
//	
//	{
//		id = 4;  //代码块赋值
//	}
	
	//如果是这样的顺序，id最后等于3
	{
		id = 4;
	}
	int id = 3; //可以
	
	
	
	
	
	
	
	
}
