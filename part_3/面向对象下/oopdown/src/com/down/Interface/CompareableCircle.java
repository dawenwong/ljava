package com.down.Interface;

public class CompareableCircle extends Circle implements CompareObject{
	
	public CompareableCircle(double raduis) {
		super(raduis);
	}
	
	//实现interface方法
	@Override
	public int compareTo(Object o) {
		
		if(this == o) {
			return 0;
		}
		
		if(o instanceof CompareableCircle) {
			CompareableCircle other = (CompareableCircle)o;
			
			//方式一：
//			if(this.getRadius() > other.getRadius()) {
//				return 1;
//			}else if(this.getRadius() < other.getRadius()) {
//				return -1;
//			}else {
//				return 0;
//			}
			
			//方式二：
			//当raduis声明为包装类时，可以使用包装类方法
			return this.getRadius().compareTo(other.getRadius());
		}else {
			return 0;
		}
		
	}
}
