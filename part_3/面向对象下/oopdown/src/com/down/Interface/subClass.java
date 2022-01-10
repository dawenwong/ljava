package com.down.Interface;

public class subClass extends superClass implements InterfaceJDK8{
	public static void main(String[] args) {
		
		subClass subClass = new subClass();
		
		subClass.method2();  //通过类的对象调用接口中的默认方法
		subClass.method3(); //通过类的对象调用接口中的重写默认方法
		
		
		InterfaceJDK8.method1(); //可以充当工具类使用了
		
		
	}
	// 重写接口中默认的方法
	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("重写默认方法");
	}
	
	public void myMethod() {
		method3(); //调自己重写的方法
		super.method3();  //调用父类中的被子类重写方法
		InterfaceJDK8.super.method3(); //调用接口中被子类重写的方法
	}
}