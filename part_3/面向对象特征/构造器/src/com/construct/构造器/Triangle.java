package com.construct.构造器;

public class Triangle {
	
	private double edgeLengthA;  //三角形A边
	private double edgeLengthB;  //三角形B边
	private double edgeLengthC;  //三角形C边
	//private double[] edgeLength = new double[3];
	
	//构造器
	public Triangle() {
		
	}
	
	public Triangle(double a,double b,double c) {
		edgeLengthA = a;
		edgeLengthB = b;
		edgeLengthC = c;
		
	}
	
	
	//set和get方法
	public void setedgeLengthA(double a) {
		edgeLengthA = a;
	}
	
	public double getedgeLengthA() {
		return edgeLengthA;
	}
	public void setedgeLengthB(double b) {
		edgeLengthB = b;
	}
	
	public double getedgeLengthB() {
		return edgeLengthB;
	}
	
	public void setedgeLengthC(double c) {
		edgeLengthC = c;
	}
	public double getedgeLengthC() {
		return edgeLengthC;
	}
	
	
	public void setedgeLength(double ...ds) {
		if(ds.length > 3) {
			System.out.println("参数不要超过3个");
			return;
		}
//		}else if( ds[0] + ds[1] <= ds[2] || ds[0] + ds[2] <= ds[1] || ds[1] + ds[2] <= ds[0] ) {
//			System.out.println("这三个数构不成三角形");
//			return;
				
		edgeLengthA = ds[0];
		edgeLengthB = ds[1];
		edgeLengthC = ds[2];
	}
	
	public double triangleArea() {
		double p = 0,area = 0;
		 if(edgeLengthA + edgeLengthB <= edgeLengthC || edgeLengthA + edgeLengthC <= edgeLengthB 
				 || edgeLengthC + edgeLengthB <= edgeLengthA  ) {
				System.out.println("这三个数构不成三角形");
				return 0.0;
		 }
		 
		//计算三角形面积
		p = (edgeLengthA + edgeLengthB + edgeLengthC)/2;
		area = Math.sqrt(p*(p-edgeLengthA)*(p-edgeLengthB)*(p-edgeLengthC));
		
		return area;
	}

		
	
}
