package com.baidu.值传递问题;

public class Test1 {
	public static void main(String[] args) {
		int i = 10 ;
		int j = 20;
	
         Test1 test = new Test1();
         test.swapVal(i, j);//在该方法执行完成后，在stack中数据就出栈了
         System.out.println("main中：");
		System.out.println("i = " + i + ";  j = " + j); //没有换成功，这里的i和j就是声明时候原始值
	}
	//c中是传递i，j的pointer解决问题
	
	public void swapVal(int m,int n) {
		int temp = m;
		m = n;
		n = temp;
		System.out.println("changVal方法中：");
		System.out.println("i = " + m + ";  j = " + n); //这里显示换值成功
	}
	
}
