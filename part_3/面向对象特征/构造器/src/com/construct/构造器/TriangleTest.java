package com.construct.构造器;

public class TriangleTest {
	public static void main(String[] args) {
//		Triangle  t1 = new Triangle();
//		t1.setBase(2.0);
//		t1.setHeight(2.4);
//		
////		t1.base = 2.3;  //设置了private 显示不可见
////		t1.height = 5.4; //只能通过setxxx（）方法来设置值
//		
//		//查看属性值，只能通过getxxx（）来获取属性值
//		System.out.println("base： "+t1.getBase()+" ,height： "+t1.getHeight());
//		
//		Triangle t2 = new Triangle(2.5,3.4);
//		System.out.println("base： "+t2.getBase()+" ,height： "+t2.getHeight());
		
		
		
		Triangle t1 = new Triangle();
		
		t1.setedgeLength(3,3,3);
		System.out.println("A： "+t1.getedgeLengthA()+" ,B： "+t1.getedgeLengthB()+
						" ,C： "+t1.getedgeLengthC());
		
		double area = t1.triangleArea();
		
		System.out.println(area);
		
		
		Triangle t2 = new Triangle();
		
		t2.setedgeLengthA(6);
		t2.setedgeLengthB(8);
		t2.setedgeLengthC(10);
		
		System.out.println("A： "+t2.getedgeLengthA()+" ,B： "+t2.getedgeLengthB()+
				" ,C： "+t2.getedgeLengthC());
		
		double area1 = t2.triangleArea();
		System.out.println(area1);
	}
	

}
