package com.oopmid.多态性;

public class Woman extends Person {
	
	boolean isBeauty;
	
	public void shopping() {
		System.out.println("女人喜欢购物逛街");
	}
	
	@Override
	public void eat() {
		System.out.println("女人吃的少，减肥");
	}
	
	@Override
	public void walk() {
		System.out.println("女人多走路保持身材");
	}
}
	

