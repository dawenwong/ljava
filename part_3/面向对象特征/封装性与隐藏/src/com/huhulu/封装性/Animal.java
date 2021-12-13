package com.huhulu.封装性;

public class Animal {
	public static void main(String[] args) {
		AnimalTest a1 = new AnimalTest();
		
		a1.name = "kris";
		//a1.age = 31;
		a1.setAge(35);
		int age = a1.getAge();
		System.out.println(age);
		
		
		
		//a1.weight = 165.3;
		//a1.weight = -90;  //体重不能为负数、0或超过某个值，因此需要对整个属性进行限值
		a1.setWeight(146);  //这是可以赋值，但是现在不能看weight的值，需要添加一个get方法
		System.out.println(a1.getWeight());
		
		//a1.weight = 1200;   //虽然上面有set方法，但是属性还是能改，因此要对weight属性权限加以限值。
		//加了private 后The field AnimalTest.weight is not visible
		a1.eat();
		a1.show();
	}
		
}


class AnimalTest{
	
	String name;
	private int age;
	private double weight;  //使用private权限修饰符对其限值
	
	
	//setWeight方法
	public void setWeight(double w) {
		if(w > 30 && w < 350) {
			weight = w;
		}else {
			weight = 105; //默认值，最好是抛出异常
			//或者抛出异常
		}
	}                         //setxxx和getxxx是封装性的体现之一
	  
	//getWeight方法
	public double getWeight() {
		
		return weight;
	}
	
	//setAge方法
	public void setAge(int a) {
		if(a > 1 && a < 110 ) {
			age = a;
		}else {
			age = 18; //这是可以抛出异常或者默认值
		}
	}
	
	//getAge方法
	public int getAge() {
		
		return age;
	}
	
	
	public void eat() {
		System.out.println("动物进食");
	}
	
	public void show() {
		System.out.println(name+" 今年"+age+"岁了，有"+ weight +"斤重!");
	}
}