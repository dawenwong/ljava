package com.erroException.TryCatchFinally;
/*
 * 自定义异常类型
 * 	1.首先要去继承现有的异常结构：RuntimeException、Exception
 * 	2.提供全局常量：serialVersionUID 
 * 	3.提供重载构造器
 * 
 * */
public class MyException extends RuntimeException{
	static final long serialVersionUID = -7034897190745766939L;
	public MyException() {
		super();
	}
	
	public MyException(String msg) {
		super(msg);
	}
}
