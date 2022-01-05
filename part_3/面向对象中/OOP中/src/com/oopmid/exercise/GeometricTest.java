package com.oopmid.exercise;

public class GeometricTest {
	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("green", 2.3, 1.2);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle("blue", 1, 3.3);
		test.displayGeometricObject(c2);
		
		if(test.equalsArea(c1, c2)) {
			System.out.println("两个面积相等");
		}else {
			System.out.println("两个面积不相等");
		}
		
		MyRetcangle r1 = new MyRetcangle("black", 1, 10, 2);
		test.displayGeometricObject(r1);
		
				
		
	}
	
	//显示对象面积，利用动态绑定
	public void displayGeometricObject(GeometricObject s) {
		System.out.println("面积为："+s.findArea());
	}
	// 比较面积是否相等，返回bool
	public boolean equalsArea(GeometricObject s1,GeometricObject s2) {
		return s1.findArea() == s2.findArea();
	}
	
	
}
