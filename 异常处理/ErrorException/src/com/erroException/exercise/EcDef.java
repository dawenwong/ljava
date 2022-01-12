package com.erroException.exercise;
/*
 *自定义异常类
 * 1.继承现有异常类
 * 2.序列号
 * 3.构造器
 * 
 * */
public class EcDef extends Exception{ //继承现有异常类
	
	//序列号
	static final long serialVersionUID = -3387516993124229948L;
	
	//构造器
	public EcDef() {
		super();
	}
	public EcDef(String message) {
		super(message);
	}
}
