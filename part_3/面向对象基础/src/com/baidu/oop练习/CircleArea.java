package com.baidu.oop练习;

public class CircleArea {
		
	//属性
	double radius; //半径
	
	//求圆的面积
//	public double findCircleArea(double r) {
//		
//		double  PI = 3.1415926;
//		
//		double circleArea = 2*PI*r*r;
//		
//		return circleArea;
//	}
	
	public void findArea() {
		double area = 2*Math.PI*radius*radius;
		System.out.println("半径为"+radius+"的圆面积是："+area);
	}
		
}

