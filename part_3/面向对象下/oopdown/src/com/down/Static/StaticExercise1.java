package com.down.Static;

import org.junit.Test;

//static 关键字的运用
public class StaticExercise1 {
	@Test
	public void testCircle() {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle(3.14);
		
		System.out.println("c1的id： "+c1.getId());
		System.out.println("c2的id： "+c2.getId());
		System.out.println("c3的id： "+c3.getId());
		System.out.println("总共创建： "+Circle.getTotal()+"个圆");
	}
}


class Circle {
	
	private double radius;
	private int id;//id自增，
	
	private static int total; //记录创建圆的个数
	private static int init = 1001; //id初始编号
	
	
	public Circle() {
		id = init++; //id自增
		total++; //每创建一个圆自增一
	}
	
	public Circle(double radius) {
		this(); //调用上面空参构造器
//		id = init++;
//		total++;
		this.radius = radius;
	}
	
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getTotal() {
		return total;
	}
	
	
	public double findArea(double radius) {
		return Math.PI*radius*radius;
	}
}