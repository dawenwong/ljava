package com.down.Interface;

/*
 * JDK8之后：除了定义全局变量和抽象方法外，还可以定义静态方法和默认方法
 * 父类中和接口中同名同参数的方法，在子类没有重写该方法时，默认是调用父类的方法--->类优先原则
 * 在没有父类时，如果多个接口中，存在同名同参的方法，却在实现类中没有重写该方法，就会报错（接口冲突），通过在实现类中重写方法修复
 * 调用接口中被子类重写的默认方法，格式:   xxxx接口.super.methodName();
 * */
public interface InterfaceJDK8 {
	
	//静态方法
	public static void method1() {
		System.out.println("定义静态方法");
	}
	
	//默认方法
	public default void method2() {
		System.out.println("定义默认方法");
	}
	//默认方法(省略public自动补充)
	default void method3() {
		System.out.println("定义默认方法");
	}
}


