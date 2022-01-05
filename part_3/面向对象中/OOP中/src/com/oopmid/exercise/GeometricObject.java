package com.oopmid.exercise;

public class GeometricObject {
	
	//属性
	protected String color;
	protected double weight;
	
	
	//get set方法
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	//构造器
	public GeometricObject(String color,double weight) {
		super();
		this.color = color;
		this.weight = weight;
	}
	
	//一般方法
	public double findArea() {
		return 1.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
