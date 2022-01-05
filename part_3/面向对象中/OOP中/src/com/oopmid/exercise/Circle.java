package com.oopmid.exercise;

public class Circle extends GeometricObject {
	//属性
	private double radius;
	
	//get set
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	//构造器
	public Circle(String color,double weight,double radius) {
		super(color, weight);
		this.radius = radius;
	}
	
	//方法重写
	@Override
	public double findArea() {
		return 3.14*radius*radius;
	}
}
