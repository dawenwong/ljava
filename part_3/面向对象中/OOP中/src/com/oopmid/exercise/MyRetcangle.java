package com.oopmid.exercise;

public class MyRetcangle extends GeometricObject {
	// 属性
	private double width;
	private double height;
	
	// 构造器
	public MyRetcangle(String color, double weight,double width,double height) {
		super(color,weight);
		this.width = width;
		this.height = height;
	}
	
	//get set 
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	// 一般方法
	@Override
	public double findArea() {
		return width*height;
	}
	
}
