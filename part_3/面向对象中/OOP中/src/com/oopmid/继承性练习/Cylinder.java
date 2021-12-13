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
	
	public double findVolume() {
		return findArea()*length;
		//return Math.PI*getRadius()*getRadius()*getLength();
		
	}
}
