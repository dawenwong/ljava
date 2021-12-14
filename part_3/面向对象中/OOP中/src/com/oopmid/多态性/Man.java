package com.oopmid.多态性;

public class Man extends Person{
	boolean isDrink;
	
	public void earMoney() {
		
		System.out.println("男人力气大，搬砖赚钱");
	}
	
	@Override
	public void eat() {
		System.out.println("男人多吃肉，长肌肉");
	}
	
	@Override
	public void walk() {
		System.out.println("男人多走路锻炼身体");
	}
}

