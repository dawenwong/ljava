package com.baidu.oopBasic;



//测试类
public class personTest{
	
}
//设计一个人的类
public class PersonTest {
	
	//属性：对应类的成员变量      Field(域、字段) = 属性
	//行为：对应类的成员方法      method = 方法  =  函数  = 行为
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	
	//方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	public void tlak(String language) {
		System.out.println("人可以使用"+language+"说话");
	}
	
	//类造好后，就要对类实例化，创建对象
}
