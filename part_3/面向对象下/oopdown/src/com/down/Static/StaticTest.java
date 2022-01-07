package com.down.Static;



/*
 * static 关键字的使用
 * 
 * 1、static（翻译）:静态的
 * 2、static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3、使用static修饰属性： 静态变量
 *		属性，是否使用static修饰分为：静态属性和非静态属性，非静态属性：实例变量
 *		实例变量：创建某类的多个对象，每个对象都独立拥有一套类中非静态属性，当修改其中一个对象中的非静态属性时，不会导致
 *		其他对象中同样的属性值的修改。
 *		
 *		静态变量：创建某类的多个对象，每个对象都共享同一个静态变量，当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改后的。
 *		
 *		static 修饰属性的其他说明：
 *			① 静态属性随类的加载而加载，可以通过“类.静态变量”的方式调用。
 *			② 静态变量加载早于对象的创建。
 *			③ 又可称类变量，由于类在内存中只加载一次，则静态变量也只会存在一份，存在方法区的静态域中
 *			
 *			④     类变量         实例变量
 *			类     Yes           No	 
 *			对象    Yes			Yes
 * 		
 * 		静态属性举例：System.out;Math.PI
 * 
 * 
 * 4、使用static修饰方法：静态方法
 * 		① 随着类的加载而加载，可以通过“类.静态方法”的方式调用
 * 		②         静态方法         非静态方法
 *			类     Yes              No	 
 *			对象    Yes			   Yes
 *		③ 静态方法中，只能调用静态方法和静态变量（生命周期一致）
 *		④ 对于非静态方法中，既可调用非静态方法或属性，也可以调用静态方法或静态属性
 *		⑤ 在静态方法类，不能使用this、super关键字
 *
 *
 *5、static总结：
 *	在开发中如何确定一个属性是否为static或一个方法是否确定为static？
 *	属性：所有的对象共享一个属性不会随着对象的不同而不同，可以加上static修饰,
 *		类中的常量也final修饰，也用static修饰，如Math类中public static final double PI = 3.14159265358979323846;
 *	方法：操作静态属性的方法，通常设置为静态方法，工具类中的方法习惯上声明为static，如：Math、Array、Collections等直接“类.方法”，
 *		就不用new一个对象后在使用其方法。
 * 
 * 
 * 
 * */
public class StaticTest {
	public static void main(String[] args) {
		
		Chinese.nation = "Chinese"; //静态属性随类的加载而加载，可以通过“类.静态变量”的方式调用。静态变量加载早于对象的创建。
		Chinese.show();  //随着类的加载而加载，可以通过“类.静态方法”的方式调用，静态方法
		
		Chinese c1 = new Chinese();
		c1.name = "张三";
		c1.age = 22;
//		c1.nation = "CHN";
		System.out.println(Chinese.nation);
		c1.show();
		c1.eat();
		
		Chinese c2 = new Chinese();
		c2.name = "李四";
		c2.age = 32;
//		c2.nation = "China";
		System.out.println(Chinese.nation);
//		System.out.println(c1.nation);  // c1.nation 也变成China
	}
}


// 中国人类
class Chinese{
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("中国人吃中餐");
	}
	
	/**
	 * @Title: show   
	 * @Description: 静态方法（类方法）
	 * @author: wdw   
	 * @param:       
	 * @return: void      
	 * @throws
	 */
	public static void show() {
		System.out.print("我是一个中国人");
//		eat(); 不能在静态方法中调用非静态方法，生命周期不一致
//		name = "Tom";不能在静态方法中调用非静态属性，生命周期不一致
		System.out.println(Chinese.nation);  //静态方法中调用静态属性可以
//		System.out.println(this.nation); //不能在静态方法中使用this关键字
		walk(); // 静态方法中调用静态方法可以，省略了Chinese类名
		Chinese.walk();  //
	}
	
	public static void walk() {
		
	}
}





















