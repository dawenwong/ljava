package com.down.Interface;
/*
 * 接口的使用：
 * 	1.接口使用interface来定义(和类定义用class一样)
 * 	2.java语言中interface和class是并列的结构
 *  3.如何定义接口：定义接口中的成员
 *  	3.1 JDK7以前:只能定义全局常量和抽象方法	
 *  		全局常量：public static final的,都是public
 *  		抽象方法：public abstract的，都是public
 *  	
 *  	3.2 JDK8:除了定义全局常量外，还可以定义静态方法和默认方法
 *  
 *  4.接口中不能定义构造器！！！因此接口不可以实例化
 *  5.在java开发中，都通过让类去实现（implements）的方式来使用
 *    如果实现类，覆盖了接口中所有抽象方法，则实现类就可以实例化
 *    如果实现类，没有覆盖接口中抽象方法，则此实现类仍一个抽象类
 *  6.java类可以实现多个接口------>弥补了java单继承性的缺陷
 *    格式：class AA extends BB implements CC,DD,EE,等{}
 *    
 *  7.接口与接口之间可以继承，而且可以多继承
 *  
 *  
 *  
 *  8.接口的具体使用，体现多态性
 *  9.接口实际上可以看做是一种规范
 *  
 *  
 *  抽象类与接口有哪些异同？
 *  
 *  
 *  
 *  
 *  		
 * */
public class InterfaceTest {
	public static void main(String[] args) {
		 
//		Flyable.MIN_SPEED = 1;  //The final field Flyable.MIN_SPEED cannot be assigned
		System.out.println("最大速度："+Flyable.MAX_SPEED);
		System.out.println("最小速度："+Flyable.MIN_SPEED);
		
		Plane plane = new Plane();
		plane.fly();
		plane.stop();
//		System.out.println(plane.MAX_SPEED);
	}
}


//定义一个接口，使用关键字interface
interface Flyable{
	
	//全局常量
	public static final int MAX_SPEED = 7800; //public static final 必须
	int MIN_SPEED = 1;  //没有写public static final不会报错，是因为自动补充，可以不写
	
	//接口中不能写构造器
//	public Flyable() {
//		// Interfaces cannot have constructors
//	}
	
	//抽象方法
	public abstract void fly();
	
	void stop(); // 因为都要写public abstract 所以也可以省略不写，会自动补上
	
}

interface Attackable{
	
	public abstract void attack();
}

class Bullet extends Object implements Flyable,Attackable,CC{

	
	//实现所有接口中的抽象方法
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method11() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void method22() {
		// TODO Auto-generated method stub
		
	}
	
}


interface AA{
	public abstract void method11();
}
interface BB{
	public abstract void method22();
}
//接口继承接口，可以多继承
interface CC extends AA,BB{
	
}







class Plane implements Flyable{  //通过implements 来实现接口，但是接口中抽象方法必须重写不然报错
	
	
	public Plane() {
		super();
	}
	//将接口中的抽象方法实现（接口中叫实现）
	@Override
	public void fly() {
		System.out.println("飞机起飞了");
	}
	//将接口中的抽象方法实现（接口中叫实现）
	@Override
	public void stop() {
		System.out.println("减速，滑动停止");
	}
	
}

abstract class kite implements Flyable{
	//因为没有实现接口中所有的抽象方法，因此该实现类是一个抽象类
	@Override
	public void fly() {
		System.out.println("人力拉线，发风筝");
	}
}
















