package com.down.Interface;

public class CompareableCircleTest {
	public static void main(String[] args) {
		CompareableCircle c1 = new CompareableCircle(7.1);
		CompareableCircle c2 = new CompareableCircle(2.1);
		
		int result = c1.compareTo(c2);
		if(result > 0) {
			System.out.println("c1 大于 c2");
		}else if(result < 0 ) {
			System.out.println("c1 小于 c2");
		}else {
			System.out.println("c1 等于 c2");
		}
	}
}
