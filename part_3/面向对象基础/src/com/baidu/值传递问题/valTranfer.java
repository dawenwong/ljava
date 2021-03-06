package com.baidu.值传递问题;

//基本数据类型，传递的是真实值
//引用类型，传递的是地址值
public class valTranfer {
	public static void main(String[] args) {
		
		data d1 = new data();
		d1.m = 10;
		d1.n = 20;
		
		System.out.println("m = " + d1.m + ",  n = " + d1.n);
		
		valTranfer swap1 = new valTranfer();
		swap1.swap(d1);
		
		System.out.println("m = " + d1.m + ",  n = " + d1.n);
		
	}
	public void swap(data d) { //相当于d1地址赋值给d,两个变量指向同一个地址(相当于一个指针)
		int temp = d.m;
		d.m = d.n;
		d.n = temp;
	}
	/*
	 * 
	 *  +-----------+   +--------------------------------------------+             
	 * 	|           |	|                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |
	 * 	|			|   |                                            |	
	 * 	|			|	|                                            |
	 * 	|			|	|    :0x1234                                 |
	 * 	|			|	|    +----------+                            |
	 * 	|			|	|    | m=10;    |                            |
	 * 	| d:0x1234	|	|    | n=20;    |                            |
	 * 	| d1:0x1234	|	|    +----------+                            |
	 * 	+-----------+	+--------------------------------------------+         
	 * 		stack                       heap
	 * */
	
}


class data{
	int m;
	int n;
}