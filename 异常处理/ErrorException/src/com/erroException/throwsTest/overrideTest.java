package com.erroException.throwsTest;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重写规则：
 * 	
 * 子类重写的方法抛出的异常不大于父类抛出的异常类型
 * 
 * 
 * */
public class overrideTest {
	
	public static void main(String[] args) {
		
		overrideTest test = new overrideTest();
		test.display(new subClass());
	}
	
	public void display(superClass s) {
		try {
			s.method();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class superClass{
	
	public void method() throws IOException{
		
	}
}

class subClass extends superClass{
	
	@Override
	public void method() throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
}