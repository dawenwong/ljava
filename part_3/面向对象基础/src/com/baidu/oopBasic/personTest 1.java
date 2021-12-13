package com.baidu.oopBasic;



//测试类
public class personTest{
	public static void main(String[] args) {
		//创建person类的对象（另一种说法就是实例化一个类，或实例化一个对象）
		Person p1 = new Person();
		//Scanner scanner = new Scanner(System.in);
		
		//修改属性
		p1.name = "Jerry";
		p1.age = 19;
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法
		p1.eat();
		p1.sleep();
		p1.tlak("chinese");
		
		
		Person p2 = p1;  //和数组情况类似，相当于赋值，p2和p1指向同一个堆heap
		p2.name = "Spark";
		p2.age = 100;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
	}
}
//设计一个人的类
class Person {
	
	//属性：对应类的成员变量      Field(域、字段) = 属性
	//行为：对应类的成员方法      method = 方法  =  函数  = 行为
	
	//属性
	String name= "Tom";
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
