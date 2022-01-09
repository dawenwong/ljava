package com.down.模板设计模式;

import org.junit.Test;

/*
 * 抽象类的应用：模板方法的设计模式
 * 
 * */
public class TemplateMethod {
	@Test
	public void test1() {
		subTemplate subtemplate = new subTemplate();
		subtemplate.spendTime();
	}
}


abstract class Template{
	/***
	 * 计算某段代码执行所需要花费的时间
	 */
	public void spendTime() {
		
		long start =System.currentTimeMillis();
		code(); //不确定部分
		long end = System.currentTimeMillis();
		
		System.out.println("执行代码花费的时间：" +(end - start));
	}
	
	public abstract void code();
}

class subTemplate extends Template{
	
	@Override
	public void code() {
		// TODO Auto-generated method stub
		for(int i = 2;i <= 1000;i++) {
			boolean isFlag = true;
			for(int j = 2;j <= Math.sqrt(i);j++) {
				if(i % j == 0) {
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
	}
}














