package com.oopmid.继承性练习;
/**
 * 
 *  圆柱 继承圆
 *
 */
public class Cylinder extends Circle{
	
	private double length; //圆柱的高
	
	public Cylinder() {
		length = 1;
	}
	public Cylinder(double length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	@Override
	public double findArea() { //返回圆柱的表面积
		
		return Math.PI*getRadius()*getRadius()*2+2*Math.PI*getRadius()*getLength();
		
		//想要使用父类中的方法，使用super
	}
	
	public double findVolume() {
		return super.findArea()*length;
		//return Math.PI*getRadius()*getRadius()*getLength();
		
	}
}
