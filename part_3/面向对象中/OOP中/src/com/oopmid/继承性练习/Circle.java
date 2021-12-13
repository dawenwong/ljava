package com.oopmid.继承性练习;
/**
 * 
 * 圆
 *
 */
public class Circle {
	
	private double radius;
	
	//构造器初始值radius = 1
	public Circle() {
		radius = 1;
	}
	
	public  Circle(double radius) {
		this.radius = radius;
	}
	
	//get和set
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//求面积
	public double findArea() {
		
		return Math.PI*radius*radius;
	}
	
}
