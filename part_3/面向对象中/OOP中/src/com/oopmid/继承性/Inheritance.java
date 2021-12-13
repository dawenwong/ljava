package com.oopmid.继承性;

/*
 * -extends 继承关键字
 * -面向对象特征之二：继承性
 * 	--继承性的优点：
 * 		---减少代码冗余，提高了代码的复用性
 * 		---便于功能的扩展
 * 		---为多态性的使用，提供了前提
 * -继承的格式：class A extends B{}
 * 	--A:子类、派生类、subclass
 * 	--B:父类、超类、基类、superclass
 * -A就继承了B 类的所有属性和方法（构造器和super关键字，这里不行）
 * 	--特别的，父类中声明为private的属性或方法，子类继承父类以后，仍然认为获取了父类中私有的结构
 * 	--只有因为封装性的影响，使得子类不能直接调用父类的结构而已。
 * 	--子类继承父类以后，还可以声明自己特有的属性或方法：实现功能的拓展。
 * 
 * -Java中继承的规定
 * 	--一个类可以被多个子类继承
 * 	--一个类只能有一个父类（单继承性，c++允许多重继承，java通过接口来实现类似的功能）
 *  --子父类是相对的，a的子类b是c的父类，a是c的间接父类,
 * 	--子类直接继承的父类叫直接父类，间接继承的叫间接父类
 *  --子类继承了父类后，就获取直接父类和间接父类的所有属性和方法
 * -如果没有显示的声明一个类的父类，则此类继承与java.lang.object类
 * 
 * 
 * */

public class Inheritance {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		//p1.sleep();  //private 
		
		System.out.println("*******************************");
		
		Student stu1 = new Student();
		//Student stu1 = new Student("张三",18,"电焊");
		//System.out.println(stu1.getName() + " "+stu1.getAge()+" "+stu1.getMajor());
		
		//stu1.age = 11;  //person中age和name已经private
		//stu1.name = "王五";//private 也继承到了，但是由于封装性的影响，不能直接调用了
		
		stu1.setName("李四");
		stu1.setAge(18);
		stu1.setMajor("挖机");
		System.out.println("姓名："+stu1.getName() + " ，年龄："+stu1.getAge()+" ，主修："+stu1.getMajor());
		stu1.eat();
		//stu1.sleep();  //已经使用private 私有化，对外不能调用，但是通过在eat（）方法中调用能行，即也继承到了
		stu1.study();
		
		
		
	}
}
