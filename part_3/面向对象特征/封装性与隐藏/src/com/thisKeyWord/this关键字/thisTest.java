package com.thisKeyWord.this关键字;

/*
 * 
 * 
 * 
 * 
 * this可以理解为当前对象或当前正在创建的对象
 * 
 *- 在类的方法中，我们可以使用"this.属性"或"this.方法"的方式，调用当前对属性或方法。
 * -但是，通常情况下，我们都选择省略"this."。
 * -特殊情况下，如果方法的形参和类的属性同名时，我们必须显式的使用"this.变量"的方式，表明此变量是属性，而非形参。
 * this 调构造器
 * 
 * 
 *		-在类的构造器中，可以显式的使用this（形参）方式，调用本类中指定的其他构造器
 *		-但是在构造器中不能通过this（形参）方式调用自己
 *      -特别的是this（形参）必须声明在当前构造器的首行
 *   	-构造器内部，最多只能声明一个this（形参），用来调用其他的构造器
 * 
 * */

public class thisTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setName("jerry");
		p1.setAge(10);
		
		System.out.println("name :"+p1.getName()+"  "+" age: "+ p1.getAge());
		p1.eat();
	}
}

class Person{
	
	private String name;
	private int age;
	
	//构造器
	public Person() {
		//this.eat();   //使用this在构造器中调方法
		String info = "初始化时，需要执行的各种赋值--------------------很多行代码";
		System.out.println(info);
	}
	
	public Person(String name) {
		this(); //调构造器，这种写法是调用的上面的构造器
		this.name = name;
	}
	
	public Person(int age) {
		this();
		this.age  = age;
	}
	public Person(int age,String name) {
		this(age); //
		//this.age = age;
		this.name = name;
	}
	
	
	public void setName(String name) {
		//name = name; //The assignment to variable name has no effect
		//正确的写法
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		//age = age;
		
		this.age = age;
	}
	
	public int getAge() {
		
		return age;
	}
	
	
	public void eat() {
		System.out.println("吃饭");
		//playgame(); //隐藏了this，但是能调用
		this.playgame();
		
	}
	
	public void playgame() {
		System.out.println("玩游戏");
	}
	
}
