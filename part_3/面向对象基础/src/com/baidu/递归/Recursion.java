package com.baidu.递归;
/*
 * 
 * 
 * -递归的使用
 * -一种隐式循环
 * -递归使用一定要注意结束条件，不然就变成死循环
 * 
 * */
public class Recursion {
	
	public static void main(String[] args) {
		
		Recursion r = new Recursion();
		
		//求1-100自然数的和
		int val = r.getSum(100);
		System.out.println(val);
		
		
		System.out.println(r.func1(10));
		
		//Fibonacci数列
		
		System.out.println(r.Fibonacci(10));
	}
	
	
	//递归方法求和
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			
			return n+getSum(n-1);
		}
		
		
	}
	
	//已知一个数列，f(0) = 1,f(1) =4,f(n+2) = 2*f(n+1)+f(n),求f(10)的值
	public int func1(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			//令n+2 = x,上面的式子就f(x) = 2*f(x-1)+f(x-2);
			return 2*func1(n-1) + func1(n-2) ; 
		}
	}
	
	
	//斐波拉契数列 n1 = 1,n2 = 1,n3 = n1+n2,n4 = n3 + n2....next等于前两项和
	public int Fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			
			return Fibonacci(n-1)+Fibonacci(n-2);
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
