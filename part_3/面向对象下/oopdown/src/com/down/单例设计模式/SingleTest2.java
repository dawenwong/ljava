package com.down.单例设计模式;

public class SingleTest2 {
		
	public static void main(String[] args) {
//		Car c1 = new Car();
		
		Car c1= Car.getInstanceCar();
		Car c2 = Car.getInstanceCar();
		System.out.println(c1 == c2); // true
	}

	
	
}
//单例设计模式二：懒汉式

class Car{
	//1.提个一个private的构造器
	private Car() {
		
	}
	
	//2.声明当前类对象，不初始化
	private static Car intanceCar = null;
	
	//3.声明public、static 的返回当前类对象的方法
	public static Car getInstanceCar() {
		//如果指向null，就new一个对象，否则存在，直接返回
		if(intanceCar == null) {
			intanceCar = new Car();
		}
		return intanceCar;
	}
}