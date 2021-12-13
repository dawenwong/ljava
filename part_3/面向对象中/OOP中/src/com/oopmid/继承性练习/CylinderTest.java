package com.oopmid.继承性练习;

public class CylinderTest {
	public static void main(String[] args) {
		Cylinder cylinder  = new Cylinder();
		
		cylinder.setRadius(2.1);
		cylinder.setLength(3.4);
		
		double area = cylinder.findArea();
		System.out.println("圆柱底面圆面积是："+area);
		
		double volume = cylinder.findVolume();
		System.out.println("圆柱体积是："+volume);
		

	}
}
